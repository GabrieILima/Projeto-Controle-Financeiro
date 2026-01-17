package main.java.gabrielhenrique.controlefinanceiro.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;


enum TipoMovimentacao {
    GANHO,
    PERDA,
    INVESTIMENTO;

    boolean ehEntrada() {
        return this == GANHO;
    }

}
enum TipoRecorrencia {
    MENSAL,
    ANUAL,
    SEMESTRAL,
    EVENTUAL
}
public class Movimentacao {
    private TipoMovimentacao tipo;
    private BigDecimal valor;
    private String descricao;
    private LocalDate dataVencimento;
    private TipoRecorrencia recorrente;

    public BigDecimal getImpact() {
        return tipo.ehEntrada() ? valor : valor.negate();
    }

    public Movimentacao(TipoMovimentacao tipo, BigDecimal valor, String descricao, LocalDate dataVencimento, TipoRecorrencia recorrente) {
        this.tipo = Objects.requireNonNull(tipo, "tipo não pode ser null");
        this.valor = Objects.requireNonNull(valor, "valor não pode ser null");
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
        this.descricao = Objects.requireNonNull(descricao, "descricao não pode ser null");
        this.dataVencimento = Objects.requireNonNull(dataVencimento, "dataVencimento não pode ser null");
        this.recorrente = Objects.requireNonNull(recorrente, "recorrente não pode ser null");
    }

    public TipoMovimentacao getTipo() { return tipo; }
    public BigDecimal getValor() { return valor; }
    public String getDescricao() { return descricao; }
    public LocalDate getDataVencimento() { return dataVencimento; }
    public TipoRecorrencia getRecorrente() { return recorrente; }

    @Override
    public String toString() {
        return "Movimentacao{" +
                "tipo=" + tipo +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", dataVencimento=" + dataVencimento +
                ", recorrente=" + recorrente +
                '}';
    }

    public boolean ocorreEm(LocalDate dataRef) {
        if (dataRef.isBefore(dataVencimento)) {
            return false;
        }
        switch (recorrente) {
            case EVENTUAL:
                return dataRef.equals(dataVencimento);
            case MENSAL:
                return dataRef.getDayOfMonth() == dataVencimento.getDayOfMonth();
            case ANUAL:
                return dataRef.getDayOfMonth() == dataVencimento.getDayOfMonth() &&
                       dataRef.getMonth() == dataVencimento.getMonth();
            case SEMESTRAL:
                long mesesEntre = java.time.temporal.ChronoUnit.MONTHS.between(
                        LocalDate.of(dataVencimento.getYear(), dataVencimento.getMonth(), dataVencimento.getDayOfMonth()),
                        LocalDate.of(dataRef.getYear(), dataRef.getMonth(), dataRef.getDayOfMonth())
                );
                return mesesEntre % 6 == 0 && dataRef.getDayOfMonth() == dataVencimento.getDayOfMonth();
            default:
                return false;
        }
    }
}


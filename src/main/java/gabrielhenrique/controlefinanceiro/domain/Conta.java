import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;


public class Conta {
    
    private List<Movimentacao> movimentacoes = new ArrayList<>();

    
    public void adicionarMovimentacao(Movimentacao movimentacao) {
        this.movimentacoes.add(Objects.requireNonNull(movimentacao, "movimentacao não pode ser null"));
        
    }
    public BigDecimal calcularSaldoDoMes(YearMonth mes) {
    BigDecimal saldo = BigDecimal.ZERO;

    for (Movimentacao m : movimentacoes) {

        int diaVencimento = m.getDataVencimento().getDayOfMonth();
        int ultimoDiaDoMes = mes.lengthOfMonth();
        int diaValido = Math.min(diaVencimento, ultimoDiaDoMes);

        LocalDate dataReferencia = mes.atDay(diaValido);

        if (m.ocorreEm(dataReferencia)) {
            saldo = saldo.add(m.getImpact());
        }
    }

    return saldo;
}
}

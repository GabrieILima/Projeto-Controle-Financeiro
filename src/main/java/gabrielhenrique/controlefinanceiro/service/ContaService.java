package main.java.gabrielhenrique.controlefinanceiro.service;

import main.java.gabrielhenrique.controlefinanceiro.domain.Conta;
import main.java.gabrielhenrique.controlefinanceiro.domain.Movimentacao;


import java.math.BigDecimal;
import java.time.YearMonth;
import java.time.LocalDate;

public class ContaService {
    private Conta conta;

    public ContaService(Conta conta) {
        this.conta = conta;
    }

    public void adicionarMovimentacao(Movimentacao movimentacao) {
        conta.adicionarMovimentacao(movimentacao);
    }

    public BigDecimal calcularSaldoDoMes(YearMonth mes) {
        return conta.calcularSaldoDoMes(mes);
    }
    
}


package br.com.letscode.contabancaria.conta;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta implements Rendimentos{

    public ContaPoupanca(Titular titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    @Override
    public BigDecimal sacar(BigDecimal valor) {
        return null;
    }

    @Override
    public BigDecimal depositar(BigDecimal valor) {
        return null;
    }

    @Override
    public void atualizar(BigDecimal taxaRendimento) {

    }
}

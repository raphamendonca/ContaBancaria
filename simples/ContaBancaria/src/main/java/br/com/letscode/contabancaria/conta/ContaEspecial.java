package br.com.letscode.contabancaria.conta;

import java.math.BigDecimal;

public class ContaEspecial extends ContaCorrente implements Rendimentos{
    public ContaEspecial(Titular titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    @Override
    public void atualizar(BigDecimal taxaRendimento) {

    }
}

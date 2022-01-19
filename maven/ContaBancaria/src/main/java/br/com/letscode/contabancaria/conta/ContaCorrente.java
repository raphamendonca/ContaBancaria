package br.com.letscode.contabancaria.conta;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{

    private BigDecimal limite;
    private BigDecimal taxa;


    public ContaCorrente(Titular titular, int numero, int agencia) {
        super(titular, numero, agencia);
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public BigDecimal getTaxa() {
        return taxa;
    }

    public void setTaxa(BigDecimal taxa) {
        this.taxa = taxa;
    }

    @Override
    public BigDecimal sacar(BigDecimal valor) {
        return null;
    }

    @Override
    public BigDecimal depositar(BigDecimal valor) {
        return null;
    }

    public BigDecimal getSaldoComLimite(){
        return null;
    }
}

package br.com.letscode.contabancaria.conta;

import java.math.BigDecimal;

public abstract class Conta {
    private Titular titular;
    private int numero;
    private int agencia;
    private BigDecimal saldo;

    public Conta(Titular titular, int numero, int agencia) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public abstract BigDecimal sacar(BigDecimal valor);
    public abstract BigDecimal depositar(BigDecimal valor);
}

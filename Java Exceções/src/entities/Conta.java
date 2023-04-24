package entities;

import exceptions.SaldoInsuficienteException;

public class Conta {
    private int numeroConta;
    private double saldo;

    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(saldo < valor){
            throw new SaldoInsuficienteException("Saldo Insuficiente para Operação");
        }else{
            saldo -= valor;
        }
    }
}

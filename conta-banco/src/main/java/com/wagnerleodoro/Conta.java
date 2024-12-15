package com.wagnerleodoro;

import java.io.StringWriter;
import java.util.Random;
import java.util.UUID;

public class Conta {
    private int numero;
    private Pessoa pessoa;
    private double saldo;
    private int agencia;

    public int getNumero() {
        return numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Conta(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.numero = 1000 + new Random().nextInt(9000);
        this.agencia = 1000 + new Random().nextInt(9000);
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public String informacoesDeConta(Pessoa pessoa) {
        pessoa.mostrarInformacoes();
        System.out.printf("| %-15s | %-25s |\n", "Agência", this.getAgencia());
        System.out.printf("| %-15s | %-25s |\n", "Conta", this.getNumero());
        System.out.printf("| %-15s | %-25.2f |\n", "Saldo", this.getSaldo());
        return "";
    }
}


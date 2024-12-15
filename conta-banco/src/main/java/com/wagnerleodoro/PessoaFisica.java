package com.wagnerleodoro;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("===============================================");
        System.out.println("|           Informações da Conta        |");
        System.out.println("===============================================");
        System.out.printf("| %-15s | %-25s |\n", "Tipo", "Pessoa Física");
        System.out.printf("| %-15s | %-25s |\n", "Titular", this.nome);
        System.out.printf("| %-15s | %-25s |\n", "Endereço", this.endereco);
        System.out.printf("| %-15s | %-25s |\n", "CPF", this.cpf);
        System.out.println("=========================================");

    }
}

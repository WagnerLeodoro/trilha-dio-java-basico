package com.wagnerleodoro;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Pessoa Jurídica");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CNPJ: " + cnpj);
    }
}

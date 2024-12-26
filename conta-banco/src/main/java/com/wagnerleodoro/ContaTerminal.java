package com.wagnerleodoro;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipoCliente = getCliente(sc);
        sc.nextLine();

        Pessoa cliente;

        cliente = getCliente(tipoCliente, sc);
        if (cliente == null) return;

        Conta conta = new Conta(cliente);
        System.out.println("Conta criada com sucesso!");
        System.out.println(conta.informacoesDeConta(cliente));

        boolean continuar = true;

        while (continuar) {
            opcoes();
            switch (sc.nextInt()) {
                case 1:
                    deposito(sc, conta);
                    break;
                case 2:
                    saque(sc, conta);
                    break;
                case 3:
                    System.out.println(conta.informacoesDeConta(conta.getPessoa()));
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Obrigado por usar nosso terminal de auto atendimento");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
            }
            sc.nextLine();
        }
    }

    private static void saque(Scanner sc, Conta conta) {
        System.out.println("Informe o valor para saque:");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);
    }

    private static void deposito(Scanner sc, Conta conta) {
        System.out.println("Informe o número da agencia: ");
        int agencia = sc.nextInt();
        System.out.println("Informe o número da conta: ");
        int numeroConta = sc.nextInt();
        if ((conta.getAgencia() != agencia) && (conta.getNumero() != numeroConta)) {
            System.out.println("Agencia ou conta inválida");
        } else {
            System.out.println("Informe o valor para depósito:");
            double valorDeposito = sc.nextDouble();
            conta.depositar(valorDeposito);
        }
    }

    private static void opcoes() {
        System.out.println("""
                Por favor, selecione uma opção:\s
                1 - Realizar depósito\s
                2 - Realizar saque\s
                3 - Exibir informações\s
                4 - Finalizar atendimento.\s
                """);
    }

    private static Pessoa getCliente(int tipoCliente, Scanner sc) {
        Pessoa cliente;
        if (tipoCliente == 1) {
            System.out.println("Informe o nome:");
            String nome = sc.nextLine();
            System.out.println("Informe o endereço:");
            String endereco = sc.nextLine();
            System.out.println("Informe o CPF:");
            String cpf = sc.nextLine();

            cliente = new PessoaFisica(nome, endereco, cpf);
        } else if (tipoCliente == 2) {
            System.out.println("Informe o nome:");
            String nome = sc.nextLine();
            System.out.println("Informe o endereço:");
            String endereco = sc.nextLine();
            System.out.println("Informe o CNPJ:");
            String cnpj = sc.nextLine();

            cliente = new PessoaJuridica(nome, endereco, cnpj);
        } else {
            System.out.println("Opção inválida!");
            sc.close();
            return null;
        }
        return cliente;
    }

    private static int getCliente(Scanner sc) {
        System.out.println("Seja bem vindo ao nosso banco");
        System.out.println("Informe o tipo de cliente:");
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
        return sc.nextInt();
    }
}
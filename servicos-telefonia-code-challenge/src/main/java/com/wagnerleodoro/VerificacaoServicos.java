package com.wagnerleodoro;

import java.util.Scanner;

public class VerificacaoServicos {
    public static void verificarServicosContratados() {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        System.out.println("Digite o serviço a ser verificado:");
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite o nome do cliente e os serviços contratados:");
        String entradaCliente = scanner.nextLine().trim();

        System.out.println("Verificando se o serviço foi contratado...");
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        //Verifique se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().contains(servico)) {
                contratado = true;
                break;
            }
        }
        if (contratado) System.out.println("Sim");
        else {
            System.out.println("Não");
        }

    }

    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        //Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
            if(servico.contains("movel")) {
                movelContratado = true;
            } else if(servico.contains("banda larga")) {
                bandaLargaContratada = true;
            } else if(servico.contains("tv")) {
                tvContratada = true;
            }
        }

        //Verifique se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void verfificarServicosCombo() {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        System.out.println("Digite os serviços contratados separados por vírgula:");
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        System.out.println("Verificando se o cliente contratou um combo completo...");
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}

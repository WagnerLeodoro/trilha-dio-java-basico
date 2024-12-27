package com.wagnerleodoro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        // Verificando se houve queda de conexão
        String quedaConexao = verificarQuedaConexao(velocidades);
        System.out.println(quedaConexao);

        scanner.close();

    }

    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;

        // TODO: Some todas as velocidades registradas e calcule a média
        for (String velocidade : velocidades) {
            total += Integer.parseInt(velocidade);
        }
        return (double) total / velocidades.length;
    }

    // TODO: Preencha a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        for (String velocidade : velocidades) {
            if (Integer.parseInt(velocidade) == 0) {
                return "Queda de Conexao";
            }
        }
        return "Sem Quedas";
    }
}
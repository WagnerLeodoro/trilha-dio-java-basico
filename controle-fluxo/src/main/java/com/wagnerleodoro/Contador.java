package com.wagnerleodoro;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = terminal.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro número deve ser menor que o segundo número.");
        }

    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
            if (numero1 < numero2) {
                int contagem = numero2 - numero1;
                for (int i = 1; i <= contagem; i++) {
                    System.out.println("Imprimindo o número: " + i);
                }
            } else {
                throw new ParametrosInvalidosException();
            }
    }
}


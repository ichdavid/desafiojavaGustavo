package Desafio02;

import java.util.Scanner;

public class TesteDesafio02 {
    static void main() {

        double valor1;
        double valor2;
        String sinal;

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Informe o primeiro valor");
        valor1 = sc.nextDouble();
        sc.nextLine();

        System.out.println();
        System.out.println("Informe o segundo valor");
        valor2 = sc.nextDouble();
        sc.nextLine();

        boolean verificar = false;
        do {
            System.out.println();
            System.out.println("Informe o tipo de operação");
            sinal = sc.nextLine();
            if (sinal.equals("+") || sinal.equals("-") || sinal.equals("*")) {
                double resultado = calcular(valor1, valor2, sinal);
                System.out.println();
                System.out.println("O resutado é: " + resultado);
                verificar = true;
            } else if (sinal.equals("/")) {
                if (valor2 == 0) {
                    System.out.println();
                    System.out.println("denominador não pode ser 0 em divisão!");
                    verificar = true;
                }else {
                    double resultado = calcular(valor1, valor2, sinal);
                    System.out.println();
                    System.out.println("O resutado é: " + resultado);
                    verificar = true;
                }
            } else {
                System.out.println();
                System.out.println("Operação invalida, digite novamente!");
            }

        } while (!verificar);


    }

    private static double calcular(double val1, double val2, String op) {

        double res = 0;
        if (op.equals("+")) {
            res = val1 + val2;
        } else if (op.equals("-")) {
            res = val1 - val2;
        } else if (op.equals("*")) {
            res = val1 * val2;
        } else if (op.equals("/")) {
            res = val1 / val2;
        }

        return res;
    }
}


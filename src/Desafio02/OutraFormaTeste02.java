package Desafio02;

import java.util.Scanner;

public class OutraFormaTeste02 {
    static void main() {

        double valor1;
        double valor2;
        String sinal;

        Scanner sc = new Scanner(System.in);

        valor1 = lerNumero(sc, "Informe o primeiro numero: ");
        valor2 = lerNumero(sc, "Informe o segundo numero: ");
        sinal = lerOperacao(sc, valor2);

        if(sinal != null){
            double resultado = calcular(valor1, valor2, sinal);
            System.out.println();
            System.out.println("O resultado da operação é: " + resultado);
        }


    }

    private static double lerNumero(Scanner sc, String mensagem){
        double res;

        System.out.println();
        System.out.println("" + mensagem);
        res = sc.nextDouble();
        sc.nextLine();

        return res;
    }

    private static String lerOperacao(Scanner sc, double val2){
        String sinal;
        boolean verificar = false;

        do {
            System.out.println();
            System.out.println("Informe o tipo de operação: +, -, *, /");
            sinal = sc.nextLine();
            if (sinal.equals("+") || sinal.equals("-") || sinal.equals("*")) {
                verificar = true;
            } else if (sinal.equals("/")) {
                if (val2 == 0) {
                    System.out.println();
                    System.out.println("denominador não pode ser 0 em divisão!");
                    sinal = null;
                    verificar = true;
                }
            } else {
                System.out.println();
                System.out.println("Operação invalida, digite novamente!");
            }

        } while (!verificar);

        return sinal;
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

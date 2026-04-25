package Desafio05;

public class Main {

    static void main() {

        Soma soma = new Soma();
        soma.setNumero1(5);
        soma.setNumero2(10);
        System.out.println(soma.calcular(soma.getNumero1(), soma.getNumero2()));
        System.out.println();

        Subtracao subtracao = new Subtracao();
        subtracao.setNumero1(90);
        subtracao.setNumero2(45);
        System.out.println(subtracao.calcular(subtracao.getNumero1(), subtracao.getNumero2()));
        System.out.println();

        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.setNumero1(5);
        multiplicacao.setNumero2(10);
        System.out.println(multiplicacao.calcular(multiplicacao.getNumero1(), multiplicacao.getNumero2()));
        System.out.println();

        Divisao divisao = new Divisao();
        divisao.setNumero1(100);
        divisao.setNumero2(50);
        System.out.println(divisao.calcular(divisao.getNumero1(), divisao.getNumero2()));
        System.out.println();

    }
}

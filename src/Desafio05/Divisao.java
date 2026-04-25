package Desafio05;

public class Divisao extends Calculadora {

    @Override
    public double calcular(double numero1, double numero2){
        double res=0;

        if(numero2 != 0){
            res = numero1 / numero2;
        }else{
            System.out.println("Não é possível dividir por zero!");
        }

        return res;
    }
}

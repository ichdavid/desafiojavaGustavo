package Desafio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testesAluno {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Quantos Alunos deseja cadastrar? ");
        int quantAlunos = sc.nextInt();
        sc.nextLine();

        List<Aluno> alunos = new ArrayList<>();

        String nomeAluno;
        double notaAluno;
        int cont = 1;
        do {
            System.out.println();
            System.out.println("Informe o nome do aluno [" + cont + "]");
            nomeAluno = sc.nextLine();
            boolean testeNota = false;
            do{
                System.out.println();
                System.out.println("Informe a nota do aluno [" + cont + "]");
                notaAluno = sc.nextDouble();
                if (notaAluno < 0 || notaAluno > 10.0) {
                    System.out.println("Nota invalida, tente novamente!");
                    System.out.println();
                    continue;
                }else{
                    testeNota = true;
                }
                sc.nextLine();

            }while(!testeNota);

            alunos.add(new Aluno(nomeAluno, notaAluno));
            cont++;
        } while (cont <= quantAlunos);

        imprimirAprovado(verificarAprovados(alunos));

        sc.close();

    }

    private static List<Aluno> verificarAprovados(List<Aluno> alunos) {
        List<Aluno> aprovados = new ArrayList<>();
        for (Aluno a : alunos) {
            double nota = a.getNota();
            if (nota >= 7.0) {
                aprovados.add(a);
            }
        }
        return aprovados;
    }

    private static void imprimirAprovado(List<Aluno> alunos) {

        System.out.println();
        System.out.println("-----------Verificando Aprovados-----------");
        System.out.println();
        for (Aluno ap : alunos) {
            System.out.println("O Aluno(a): " + ap.getNome() + " foi aprovado!");
        }
    }
}

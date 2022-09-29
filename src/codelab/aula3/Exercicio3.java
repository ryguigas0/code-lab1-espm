package codelab.aula3;
import java.util.Scanner;

public class Exercicio3 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        // notas[aluno][nome / notas][nota x]
        System.out.print("Digite a quantidade de alunos: ");
        int quantAlunos = kb.nextInt();
        kb.nextLine();

        String[] listaAlunos = new String[quantAlunos];

        pegarNomeAlunos(listaAlunos);

        double[][] notas = new double[listaAlunos.length][3];
        pegarNotasAlunos(notas, listaAlunos);

        printarResultado(listaAlunos, notas);
    }

     static void printarResultado(String[] listaAlunos, double[][] notas) {
        System.out.println("NOME ALUNO - MÉDIA - SITUAÇÃO");
        for (int i = 0; i < listaAlunos.length; i++) {
            String nome = listaAlunos[i];

            double media = notas[i][0] * 0.3 + notas[i][1] * 0.5 + notas[i][2] * 0.2;

            String situacao = "REPROVADO";
            if (media >= 7) {
                situacao = "APROVADO";
            }

            System.out.println(nome + " - " + String.format("%.2f", media) + " - " + situacao);

        }
    }

    static void pegarNotasAlunos(double[][] notas, String[] listaAlunos) {
        for (int iAluno = 0; iAluno < listaAlunos.length; iAluno++) {
            System.out.println("Para o aluno " + listaAlunos[iAluno] + " digite: ");

            System.out.print("A nota da prova 1: ");
            notas[iAluno][0] = kb.nextFloat();

            System.out.print("A nota da prova 2: ");
            notas[iAluno][0] = kb.nextFloat();

            System.out.print("A nota do trabalho: ");
            notas[iAluno][0] = kb.nextFloat();

        }
    }

    static void pegarNomeAlunos(String[] listaAlunos) {
        for (int i = 0; i < listaAlunos.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            listaAlunos[i] = kb.nextLine();
        }
    }
}

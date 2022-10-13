package codelab.prova1;

import java.util.Scanner;

public class Questao1 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        // Letra A
        int[] vetorA = new int[5], vetorB = new int[5];

        preencherVetor(vetorA, "primeiro");
        preencherVetor(vetorB, "segundo");

        // Letra B
        int repeticoes = compararVetores(vetorA, vetorB);

        System.out.println("O primeiro elemento do vetor (" + vetorA[0] + ") se repete " + repeticoes
                + " vez(es) no segundo vetor");

    }

    private static int compararVetores(int[] vetorA, int[] vetorB) {
        int primeiroVetorA = vetorA[0], repeticoes = 0;

        for (int i = 0; i < vetorB.length; i++) {
            if (primeiroVetorA == vetorB[i]) {
                repeticoes++;
            }
        }

        return repeticoes;
    }

    private static void preencherVetor(int[] vetor, String nomeVetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o valor da posição " + (i + 1) + " do vetor " + nomeVetor + ": ");
            vetor[i] = kb.nextInt();
        }
    }
}

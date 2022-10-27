package codelab.aula5;

import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetor = gerarVetor(5, 20);
        imprimeVetor("Vetor gerado", vetor);
        int soma = somaRecursiva(0, 0, vetor);
        System.out.println("Soma dos elementos do vetor: " + soma);
    }

    static int somaRecursiva(int soma, int ind, int[] vetor) {
        if (ind == vetor.length) {
            return soma;
        }

        return somaRecursiva(soma + vetor[ind], ind + 1, vetor);
    }

    static int[] gerarVetor(int qtd, int limite) {
        int[] nums = new int[qtd];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = gerarNumeroAleatorio(limite);
        }

        return nums;
    }

    static int gerarNumeroAleatorio(int limite) {
        Random r = new Random();

        return r.nextInt(limite);
    }

    static void imprimeVetor(String msg, int[] vetor) {
        System.out.println(msg);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
        }
        System.out.println();
    }
}

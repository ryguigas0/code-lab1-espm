package codelab.aula3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int linhaA = pegarInput("Total de linhas da matriz A: ");
        int colunaA = pegarInput("Total de colunas da matriz A: ");

        int linhaB = colunaA;
        int colunaB = pegarInput("Total de colunas da matriz B: ");

        System.out.println("A matriz ");
        int[][] matx = gerarMatriz(linhaA, colunaA);
        printarMatriz(matx);

        System.out.println("Multiplicado por");
        int[][] maty = gerarMatriz(linhaB, colunaB);
        printarMatriz(maty);

        System.out.println("Resulta em");
        int[][] matResultado = multiplicarMatrizes(matx, maty);
        printarMatriz(matResultado);
    }

    private static int pegarInput(String label) {
        int input = -1;
        do {
            System.out.print(label);
            input = kb.nextInt();
        } while (input <= 0);

        return input;
    }

    private static int[][] multiplicarMatrizes(int[][] matx, int[][] maty) {

        int linMatx = matx.length, colMaty = maty[0].length;

        int[][] matResultado = new int[linMatx][colMaty];

        for (int i = 0; i < linMatx; i++) {
            for (int j = 0; j < colMaty; j++) {
                int[] linhax = matx[i];
                int[] colunay = pegarColunaMatriz(maty, j);
                matResultado[i][j] = somarLinhaColunaMatriz(linhax, colunay);
            }
        }

        return matResultado;
    }

    private static int somarLinhaColunaMatriz(int[] linha, int[] coluna) {
        int soma = 0;

        for (int i = 0; i < coluna.length; i++) {
            soma += linha[i] * coluna[i];
        }

        return soma;
    }

    private static int[] pegarColunaMatriz(int[][] matriz, int posColuna) {
        int tamanhoColuna = matriz.length;
        int[] coluna = new int[tamanhoColuna];

        for (int i = 0; i < coluna.length; i++) {
            coluna[i] = matriz[i][posColuna];
        }

        return coluna;
    }

    private static void printarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] gerarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerarNumero(6);
            }
        }

        return matriz;
    }

    private static int gerarNumero(int bound) {
        Random r = new Random();
        return r.nextInt(bound);
    }

}

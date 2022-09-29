package codelab.aula3;
import java.util.Random;

public class Exercicio5 {
    public static void main(String[] args) {
        int[][] matriz = gerarMatriz(4);

        System.out.println("Matriz antes: ");
        printMatriz(matriz);

        trocarDiagonais(matriz);

        System.out.println("Matriz depois: ");
        printMatriz(matriz);
    }

    static void trocarDiagonais(int[][] matriz) {
        for (int i = 0, j = matriz.length - 1; i < matriz.length; i++, j--) {
            int aux = matriz[i][i];

            matriz[i][i] = matriz[i][j];

            matriz[i][j] = aux;

        }

    }

    static int[][] gerarMatriz(int size) {
        Random r = new Random();
        int[][] matriz = new int[size][size];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int valor = r.nextInt(100);
                matriz[i][j] = valor;
            }
        }

        return matriz;
    }

    static void printMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

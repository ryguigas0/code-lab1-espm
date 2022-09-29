package codelab.aula3;
import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 2;

        System.out.println("A matriz ");
        int[][] matx = gerarMatriz(a, b);
        printarMatriz(matx);

        System.out.println("Multiplicado por");
        int[][] maty = gerarMatriz(b, c);
        printarMatriz(maty);

        System.out.println("Resulta em");
        int[][] matResultado = multiplicarMatrizes(matx, maty);
        printarMatriz(matResultado);
    }

    private static int[][] multiplicarMatrizes(int[][] matx, int[][] maty) {

        int linMatx = matx.length, colMaty = maty[0].length;

        int[][] matResultado = new int[linMatx][colMaty];

        for (int i = 0; i < linMatx; i++) {
            for (int j = 0; j < colMaty; j++) {
                int[] linhax = matx[i];
                int[] colunay = pegarColunaMatriz(maty, j);
                int elemento = somarLinhaColunaMatriz(linhax, colunay);

                matResultado[i][j] = elemento;
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

    static void printarMatriz(int[][] matriz) {
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
                matriz[i][j] = gerarNumero(5);
            }
        }

        return matriz;
    }

    private static int gerarNumero(int bound) {
        Random r = new Random();
        return r.nextInt(bound);
    }

}

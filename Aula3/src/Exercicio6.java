import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 2;

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

        int lenLinMatx = matx.length, lenColMaty = maty[0].length;

        int[][] matResultado = new int[lenLinMatx][lenColMaty];

        for (int i = 0; i < matResultado.length; i++) {
            for (int j = 0; j < matResultado[i].length; j++) {
                int[] linhaMatx = matx[i];
                int[] colMaty = pegarColunaMatriz(maty, j);
                matResultado[i][j] = somarLinhaColunaMatriz(linhaMatx, colMaty);
            }
        }

        return matResultado;
    }

    private static int somarLinhaColunaMatriz(int[] linha, int[] coluna) {
        int soma = 0;

        for (int i = 0; i < coluna.length; i++) {
            soma += linha[i] + coluna[i];
        }

        return soma;
    }

    private static int[] pegarColunaMatriz(int[][] maty, int posColuna) {
        int lenLinha = maty[0].length;
        int[] coluna = new int[lenLinha];
        for (int i = 0; i < lenLinha; i++) {
            coluna[i] = maty[posColuna][i];
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
                matriz[i][j] = gerarNumero(10);
            }
        }

        return matriz;
    }

    private static int gerarNumero(int bound) {
        Random r = new Random();
        return r.nextInt(bound);
    }

}

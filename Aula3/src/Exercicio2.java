import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] matriz = gerarMatriz(10, 1000);

        System.out.println("Para a matriz");
        printMatriz(matriz);

        int maior = pegaMaiorValorMatriz(matriz);
        System.out.println("O maior valor é: " + maior);

        printPosicoesValor(matriz, maior);
    }

     static void printPosicoesValor(int[][] matriz, int alvo) {
        System.out.println("Coordenadas encontradas");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == alvo) {
                    System.out.println("x: " + (j + 1) + " y: " + (i + 1));
                }
            }
        }
    }

     static int pegaMaiorValorMatriz(int[][] matriz) {
        int maior = -1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }

     static void printMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

     static int[][] gerarMatriz(int size, int limiteNumero) {
        Random r = new Random();
        int[][] matriz = new int[size][size];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int valor = r.nextInt(limiteNumero);
                matriz[i][j] = valor;
            }
        }

        return matriz;
    }
}

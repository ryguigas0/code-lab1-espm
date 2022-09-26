import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        int[][] matriz = gerarMatriz(4);

        System.out.println("Para a matriz: ");

        printMatriz(matriz);

        printarSomaDiagonais(matriz);

    }

    static void printarSomaDiagonais(int[][] matriz) {
        int somaPrincipal = 0, somaSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            somaPrincipal += matriz[i][i];

            somaSecundaria += matriz[matriz.length - 1 - i][i];
        }

        System.out.println("Soma diagonal principal: " + somaPrincipal);
        System.out.println("Soma diagonal secundaria: " + somaSecundaria);

    }

    static void printMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
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
}

package codelab.prova1;

import java.util.Scanner;

public class Questao4 {

    static Scanner kb = new Scanner(System.in);

    static String[] meses = {
            "janeiro",
            "fevereiro",
            "março",
            "abril",
            "maio",
            "junho",
            "julho",
            "agosto",
            "setembro",
            "outubro",
            "novembro",
            "dezembro",
    };

    public static void main(String[] args) {

        // Letra A
        System.out.print("Digite a quantidade de modelos de aparelhos de TV: ");
        int quantModelos = kb.nextInt();
        int[][] pecasModelos = gerarMatrizPecasModelos(quantModelos);

        // Letra B
        System.out.print("Digite a quantidade de meses: ");
        int quantMeses = kb.nextInt();
        int[][] modelosEncomendas = gerarMatrizModelosEncomendas(quantMeses, quantModelos);

        // Letra C
        int[][] pecasEncomendas = gerarMatrizPecasEncomendas(pecasModelos, modelosEncomendas);
        printarMatrizPecasEncomendas(pecasEncomendas);
    }

    private static void printarMatrizPecasEncomendas(int[][] pecasEncomendas) {
        System.out.println("Estimativa de encomendas");
        for (int i = 0; i < pecasEncomendas.length; i++) {
            if (i == 0) {
                System.out.println("Quantidade de válvulas");
            } else {
                System.out.println("Quantidade de alto-falantes");
            }
            for (int j = 0; j < pecasEncomendas[i].length; j++) {
                System.out.println(meses[j] + ": " + pecasEncomendas[i][j]);
            }
        }
    }

    private static int[][] gerarMatrizPecasEncomendas(int[][] pecasModelos, int[][] modelosEncomendas) {

        int quantPecas = pecasModelos.length, quantEncomendas = modelosEncomendas[0].length;

        int[][] output = new int[quantPecas][quantEncomendas];

        for (int pec = 0; pec < quantPecas; pec++) {
            for (int enc = 0; enc < quantEncomendas; enc++) {
                int[] lin = pecasModelos[pec];
                int[] col = new int[modelosEncomendas.length];

                for (int i = 0; i < col.length; i++) {
                    col[i] = modelosEncomendas[i][enc];
                }

                int soma = 0;

                for (int i = 0; i < col.length; i++) {
                    soma += lin[i] * col[i];
                }

                output[pec][enc] = soma;
            }
        }

        return output;
    }

    private static int[][] gerarMatrizModelosEncomendas(int quantMeses, int quantModelos) {
        int output[][] = new int[quantModelos][quantMeses];

        for (int mod = 0; mod < quantModelos; mod++) {
            System.out.println("Para o modelo " + (mod + 1) + ": ");
            for (int mes = 0; mes < quantMeses; mes++) {
                System.out.print("Quantidade de modelos " + (mod + 1) + " para o mês de " + meses[mes] + ": ");
                output[mod][mes] = kb.nextInt();
            }
        }

        return output;
    }

    private static int[][] gerarMatrizPecasModelos(int quantModelos) {
        int[][] output = new int[2][quantModelos];

        for (int mod = 0; mod < quantModelos; mod++) {
            System.out.println("Para o modelo " + (mod + 1) + ": ");

            System.out.print("# de válvulas: ");
            output[0][mod] = kb.nextInt();

            System.out.print("# de alto falantes: ");
            output[1][mod] = kb.nextInt();

        }

        return output;
    }
}

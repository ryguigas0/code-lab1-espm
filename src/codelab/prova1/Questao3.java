package codelab.prova1;

import java.util.Random;
import java.util.Scanner;

public class Questao3 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        // Letra A
        System.out.print("Quantidade de cidades: ");
        int quantCidades = kb.nextInt();
        kb.nextLine();

        String[] nomeCidades = preencharVetorString(quantCidades);

        // Letra B

        int[][] matrizVoos = gerarMatrizVoos(quantCidades);

        // Letra C
        printarMatrizVoos(matrizVoos, nomeCidades);

        // Letra D
        System.out.println("------------Busca de voos-------------");
        System.out.print("Insira o nome da cidade de origem: ");
        String cidadeOrigem = kb.nextLine();

        System.out.print("Insira o nome da cidade de destino: ");
        String cidadeDest = kb.nextLine();

        if (cidadeDest.equals(cidadeOrigem)) {
            System.out.println("A cidade de origem e destinos devem ser diferentes!");
            return;
        }

        int indexOri = indexCidade(nomeCidades, cidadeOrigem);

        if (indexOri == -1) {
            System.out.println("Não existem voos saindo de '" + cidadeOrigem + "'");
            return;
        }

        int indexDest = indexCidade(nomeCidades, cidadeDest);

        if (indexDest == -1) {
            System.out.println("Não existem voos saindo de '" + cidadeDest + "'");
            return;
        }

        System.out.println(String.format("Tempo de voo de '%s' para '%s' é %d hora(s)", cidadeOrigem, cidadeDest,
                matrizVoos[indexOri][indexDest]));
    }

    private static int indexCidade(String[] listaCidades, String nomeCidade) {
        for (int i = 0; i < listaCidades.length; i++) {
            if (nomeCidade.equalsIgnoreCase(listaCidades[i])) {
                return i;
            }
        }

        return -1;
    }

    private static void printarMatrizVoos(int[][] matrizVoos, String[] nomeCidades) {
        System.out.println("------------Quadro de voos-------------");
        for (int y = 0; y < matrizVoos.length; y++) {
            for (int x = 0; x < matrizVoos.length; x++) {
                if (y != x) {
                    System.out.println(
                            String.format("'%s' -> '%s' Tempo estimado: %d hora(s)",
                                    nomeCidades[y], nomeCidades[x], matrizVoos[y][x]));
                }
            }
        }
    }

    private static int[][] gerarMatrizVoos(int quantCidades) {
        int[][] output = new int[quantCidades][quantCidades];

        for (int x = 0; x < output.length; x++) {
            for (int y = 0; y < output.length; y++) {
                if (x == y || (output[y][x] != 0)) {
                    continue;
                }

                output[y][x] = gerarNumero(10);
                output[x][y] = output[y][x];
            }
        }

        return output;
    }

    private static int gerarNumero(int limite) {
        Random r = new Random();

        return r.nextInt(limite);
    }

    private static String[] preencharVetorString(int quantCidades) {

        String[] output = new String[quantCidades];

        for (int i = 0; i < output.length; i++) {
            System.out.print("Digite o nome da cidade " + (i + 1) + ": ");
            output[i] = kb.nextLine();
        }

        return output;
    }
}

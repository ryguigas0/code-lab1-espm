package codelab.aula5;

import java.util.Scanner;

public class Exercicio5 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int dec = -1;

        do {
            System.out.print("Digite um número inteiro em decimal: ");
            dec = kb.nextInt();
        } while (dec <= -1);

        int potenciaMaisProxima = (int) encontrarPotenciaMaisProxima(dec);

        String binario = decimalParaBinario(dec, potenciaMaisProxima, "");

        System.out.println(dec + " em binário é " + binario);
    }

    private static double encontrarPotenciaMaisProxima(int num) {

        int pot = 0;

        while (Math.pow(2, pot) < num) {
            pot++;
        }

        return pot;
    }

    private static String decimalParaBinario(int dec, int potenciaAtual, String binario) {
        if (potenciaAtual == -1) {
            return binario;
        }

        int diff = dec - ((int) Math.pow(2, potenciaAtual));

        if (diff >= 0) {
            return decimalParaBinario(diff, potenciaAtual - 1, binario + "1");
        } else {
            return decimalParaBinario(dec, potenciaAtual - 1, binario + "0");
        }

    }
}

package codelab.aula5;

import java.util.Scanner;

public class Exercicio4 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        int n, m = -1;

        System.out.print("Digite um número: ");
        n = kb.nextInt();

        do {
            System.out.print("Digite o digito para procurar em " + n + ": ");
            m = kb.nextInt();
        } while (m < 0 || m >= 10);

        int resultado = busca("" + n, "" + m, 0, 0);

        System.out.println("O digito " + m + " foi encontrado " + resultado + " vez(es) no número " + n);
    }

    private static int busca(String numString, String digito, int resultado, int indice) {
        if (indice == numString.length()) {
            return resultado;
        } else if ((numString.charAt(indice) + "").equals(digito + "")) {
            return busca(numString, digito, resultado + 1, indice + 1);
        } else {
            return busca(numString, digito, resultado, indice + 1);
        }

    }
}

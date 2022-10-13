package codelab.prova1;

import java.util.Scanner;

public class Questao2 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite uma frase:");
        String frase = kb.nextLine();


        String fraseInvertida = inverterString(frase);
        System.out.println("A frase '" + frase + "' invertida é: ");
        System.out.println(fraseInvertida);

    }

    private static String inverterString(String string) {
        String output = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            output += "" + string.charAt(i);
        }

        return output;
    }
}

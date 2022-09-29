package codelab.aula2;
import java.util.Scanner;

public class Exercicio1 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.print("Digite uma frase --> ");
        String frase = kb.nextLine();

        boolean palindromo = checarPalindromo(frase);

        if (palindromo) {
            System.out.println("É um palindromo!");
        } else {
            System.out.println("Não é um palindromo!");
        }
    }

    private static boolean checarPalindromo(String frase) {

        frase = frase.replaceAll(" ", "");

        String invertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }

        return invertida.equalsIgnoreCase(frase);
    }
}

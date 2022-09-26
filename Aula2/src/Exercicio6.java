import java.util.Scanner;

public class Exercicio6 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        String input = getStringInput("Digite uma mensagem para encriptar --> ");
        int cifra = getIntInput("Digite um número para cifrar --> ");

        String encriptado = encriptar(input.toUpperCase(), cifra);

        printarConsole("Não encriptado --> ", input);
        printarConsole("Encriptado --> ", encriptado);
    }

    private static String getStringInput(String msg) {
        System.out.print(msg);
        return kb.nextLine();
    }

    private static int getIntInput(String msg) {
        System.out.print(msg);
        return kb.nextInt();
    }

    private static String encriptar(String frase, int cifra) {
        String cifrado = "";

        for (int i = 0; i < frase.length(); i++) {
            String l = "" + frase.charAt(i);

            cifrado += cifrarLetra(l, cifra);
        }

        return cifrado;
    }

    private static String cifrarLetra(String letra, int cifra) {
        if (letra.equals(" ")) {
            return letra;
        } else {
            String[] letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

            int indexLetra = 0;

            for (int i = 0; i < letras.length; i++) {
                if (letra.equals(letras[i])) {
                    System.out.println(letra + " --> " + i);
                    indexLetra = i + 1;
                    break;
                }
            }

            int indexCifrado = ((indexLetra + cifra) % letras.length) - 1;

            return letras[indexCifrado];
        }
    }

    private static void printarConsole(String msg, String value) {
        System.out.println(msg);
        System.out.println(value);
    }
}
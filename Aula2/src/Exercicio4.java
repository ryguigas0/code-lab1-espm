import java.util.Scanner;

public class Exercicio4 {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Escreva uma sequência do DNA (GTCA) para ser gerada a complementar --> ");
        String input = kb.nextLine().toUpperCase();
        
        String complementar = gerarComplementar(input);

        printMessageString("DNA fornecido: ", input);
        printMessageString("Fita complementar: ", complementar);
    }

    private static void printMessageString(String msg, String string) {
        System.out.println(msg);
        System.out.println(string);
    }

    private static String gerarComplementar(String input) {
        String comp = "";

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'G':
                    comp += 'C';
                    break;
                case 'T':
                    comp += 'A';
                    break;
                case 'C':
                    comp += 'G';
                    break;
                case 'A':
                    comp += 'T';
                    break;

                default:
                    break;
            }
        }

        return comp;
    }
}

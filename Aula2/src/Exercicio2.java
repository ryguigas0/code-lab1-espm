import java.util.Scanner;

public class Exercicio2 {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite uma palavra --> ");

        String input = kb.nextLine(), output = "";

        for (int i = 0; i < input.length(); i++) {
            output += input.charAt(i);
            System.out.println(output);
        }
    }
}

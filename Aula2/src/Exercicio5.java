import java.util.Scanner;

public class Exercicio5 {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Escreva um email: ");
        String inputEmail = kb.nextLine();

        boolean email = inputEmail.contains("@")
                && !(inputEmail.charAt(0) == '@' && inputEmail.charAt(inputEmail.length() - 1) == '@');
        if (email) {
            System.out.println("É um email válido!");
        } else {
            System.out.println("Não é um email válido!");
        }
    }
}

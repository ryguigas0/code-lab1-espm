import java.util.Scanner;

public class Exercicio3 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int a = inputNum();
        int b = inputNum();
        int c = inputNum();

        int maior = retornaMaior(a, b, c);

        System.out.println("O maior número é: " + maior);

    }

    static int retornaMaior(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        }
        return c;
    }

    static int inputNum() {
        System.out.print("Digite um número: ");

        return kb.nextInt();
    }
}

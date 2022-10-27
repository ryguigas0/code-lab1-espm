package codelab.aula5;

import java.util.Scanner;

public class Exercicio6 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int input;

        do {
            System.out.print("Digite um número inteiro: ");
            input = kb.nextInt();
        } while (input <= -1);

        int resultado = fib(input);

        System.out.println("O número de posição " + input + " no fibonacci é " + resultado);
    }

    private static int fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}

package codelab.aula5;

import java.util.Scanner;

public class Exercicio2 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        double x, n = -1;

        System.out.print("Insira o valor de x: ");
        x = kb.nextDouble();

        do {
            System.out.print("Insira o valor de n: ");
            n = kb.nextDouble();
        } while (n < 0);

        double resultado = potenciacao(x, n);

        System.out.println("x ^ n = " + resultado);
    }

    private static double potenciacao(double x, double n) {

        if (n <= 0) {
            return 1;
        }

        return x * potenciacao(x, n - 1);
    }

}

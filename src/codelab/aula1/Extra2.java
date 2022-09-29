package codelab.aula1;
import java.util.Scanner;

public class Extra2 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        double x = inputDouble("Insira o valor do x --> ");

        System.out.print("Para x igual a " + x);

        if (x > 16) {
            double y = dividir(somar(multiplicar(5, x), 3), Math.sqrt(somar(multiplicar(x, x), -16)));

            System.out.println(", y é igual a " + y);
        } else {
            System.out.println(", y não é real");
        }
    }

    private static double dividir(double a, double b) {
        return a / b;
    }

    private static double somar(double a, double b) {
        return a + b;
    }

    private static double multiplicar(double a, double b) {
        return a * b;
    }

    static double inputDouble(String message) {
        System.out.print(message);
        return kb.nextDouble();
    }

}

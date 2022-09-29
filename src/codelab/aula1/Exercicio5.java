package codelab.aula1;
import java.util.Scanner;

public class Exercicio5 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        double a = inputDouble("Digite o 'a' da equação ax² + bx + c: ");
        double b = inputDouble("Digite o 'b' da equação ax² + bx + c: ");
        double c = inputDouble("Digite o 'c' da equação ax² + bx + c: ");

        double delta = calcDelta(a, b, c);

        if (delta < 0) {
            System.out.println("Essa equação nao tem raízes");
        } else {
            double[] raizes = retornaRaizes(delta, a, b, c);
            System.out.println("As raízes dessa equação são " + raizes[0] + " e " + raizes[1]);
        }
    }

    static double[] retornaRaizes(double delta, double a, double b, double c) {
        double[] raizes = new double[2];

        raizes[0] = ((b * -1) + Math.sqrt(delta)) / (2 * a);
        raizes[1] = ((b * -1) - Math.sqrt(delta)) / (2 * a);

        return raizes;

    }

    static double calcDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    static double inputDouble(String message) {
        System.out.print(message);
        return kb.nextDouble();
    }
}

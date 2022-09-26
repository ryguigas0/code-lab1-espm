import java.util.Scanner;

public class Exercicio2 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        int lado1 = inputLado(1);
        int lado2 = inputLado(2);
        int lado3 = inputLado(3);

        if (ehTriangulo(lado1, lado2, lado3)) {
            imprimeClassificacaoTriangulo(lado1, lado2, lado3);
        } else {
            System.out.println("Não é um triângulo!");
        }
    }

    static void imprimeClassificacaoTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Esse triângulo é equilátero!");
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            System.out.println("Esse triângulo é isósceles!");
        } else {
            System.out.println("Esse triângulo é escaleno!");
        }
    }

    static boolean ehTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 + lado2 >= lado3) && (lado1 + lado3 >= lado2) && (lado2 + lado3 >= lado2);
    }

    static int inputLado(int numLado) {
        int lado;

        do {
            System.out.print("Escreva o lado " + numLado + " do triângulo: ");
            lado = kb.nextInt();
        } while (lado <= 0);

        return lado;
    }
}

package codelab.aula1;
import java.util.Scanner;

public class Exercicio4 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = inputNum();
        int num2 = inputNum();

        int mdc = orderNums(num1, num2);
        System.out.println(mdc);
    }

    static int orderNums(int num1, int num2) {
        int mdc = 1;

        if (num1 >= num2) {
            mdc = calcMdc(num1, num2);
        } else {
            mdc = calcMdc(num2, num1);
        }

        return mdc;
    }

    static int calcMdc(int a, int b) {
        int mdc = 1;

        for (int div = 2; div <= a; div++) {

            while (a % div == 0 && b % div == 0) {
                a /= div;
                b /= div;
                mdc *= div;
            }
        }

        return mdc;
    }

    static int inputNum() {
        int num;

        do {
            System.out.print("Digite um número inteiro e positivo: ");
            num = kb.nextInt();
        } while (num <= 0);

        return num;
    }
}

package codelab.aula1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        int num;

        do {
            System.out.print("Digite um número positivo: ");
            num = kb.nextInt();
        } while (num <= 0);

        kb.close();

        System.out.println(num + " é divisível por: ");

        for (int i = 1; i <= num; i++) {
            imprimeNumeroDivisor(num, i);
        }

        System.out.println();
    }

    static void imprimeNumeroDivisor(int num, int div) {
        if (num % div == 0) {
            System.out.print(div + " ");
        }
    }
}

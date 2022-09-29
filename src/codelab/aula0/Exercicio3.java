package codelab.aula0;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // int tamanho = kb.nextInt(), primos = 0;
        int tamanho = 1000, primos = 0;
        // int tamanho = 5, primos = 0;

        int[] arr = new int[tamanho];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();

            boolean primo = true;
            for (int j = arr[i]; j >= 2; j--) {
                if (arr[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                primos++;
            }
        }

        kb.close();

        System.out.println("Quantidade de números primos armazenado é: " + primos);
    }
}

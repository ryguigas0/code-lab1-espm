import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Quantos números diferentes devem ser gerados? ");
        int qtd = kb.nextInt();

        kb.close();

        int[] nums = new int[qtd];

        for (int i = 0; i < nums.length; i++) {
            int novoNum;

            do {
                novoNum = gerarNumeroAleatorio(qtd);
            } while (numeroPresenteNaLista(nums, novoNum));

            nums[i] = novoNum;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }

    public static int gerarNumeroAleatorio(int qtd) {
        Random r = new Random();

        return r.nextInt(qtd) + 1;
    }

    public static boolean numeroPresenteNaLista(int[] numeros, int alvo) {

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == alvo) {
                return true;
            }
        }

        return false;
    }
}

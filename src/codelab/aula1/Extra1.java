package codelab.aula1;
import java.util.Random;

public class Extra1 {
    public static void main(String[] args) {
        int[] vetor = gerarVetor(10);

        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }

        imprimirTabuada(maior, 10);
    }

    private static void imprimirTabuada(int num, int quant) {
        for (int i = 1; i <= quant; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    static int[] gerarVetor(int qtd) {
        int[] nums = new int[qtd];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = gerarNumeroAleatorio();
        }

        return nums;
    }

    public static int gerarNumeroAleatorio() {
        Random r = new Random();

        return r.nextInt();
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
import java.util.Random;

public class Exercicio6ComMetodos {
    public static void main(String[] args) {

        int[] vetor = gerarVetor(10, 75);
        imprimeVetor("Antes de ordenar", vetor);
        int[] vetorOrdemCrescente = ordernarVetorCrescente(vetor);
        imprimeVetor("Depois de ordenar", vetorOrdemCrescente);

    }

    static void imprimeVetor(String msg, int[] vetor) {
        System.out.println(msg);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
        }
        System.out.println();
    }

    static int[] ordernarVetorCrescente(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        return vetor;
    }

    static int[] gerarVetor(int qtd, int limite) {
        int[] nums = new int[qtd];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = gerarNumeroAleatorio(limite);
        }

        return nums;
    }

    static int gerarNumeroAleatorio(int limite) {
        Random r = new Random();

        return r.nextInt(limite);
    }

}

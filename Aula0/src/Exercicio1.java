import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {

        Scanner kb = new Scanner(System.in);

        // int tamanho = kb.nextInt();
        int tamanho = 5;

        int[] arr = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {

            System.out.print("Digite o elemento " + (i + 1) + " --> ");

            arr[i] = kb.nextInt();
        }

        kb.close();

        int maior = arr[0], menor = arr[0];

        for (int i = 0; i < tamanho; i++) {
            int valor = arr[i];
            if (maior < valor) {
                maior = valor;
            }
            if (menor > valor) {
                menor = valor;
            }

        }

        System.out.println("O menor número armazenado é --> " + menor);
        System.out.println("O maior número armazenado é --> " + maior);
    }
}

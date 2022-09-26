import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {

        Scanner kb = new Scanner(System.in);

        int tamanho = 5, par = 0;

        int[] arr = new int[tamanho];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
            
            if (arr[i] % 2 == 0) {
                par++;
            }
        }

        kb.close();

        System.out.println("Quantidade de números pares armazenado é: " + par);
        System.out.println("Quantidade de números ímpares armazenado é: " + (arr.length - par));
    }
}

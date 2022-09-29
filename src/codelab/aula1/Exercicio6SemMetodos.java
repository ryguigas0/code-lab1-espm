package codelab.aula1;
import java.util.Random;

public class Exercicio6SemMetodos {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            Random r = new Random();
          
            vetor[i] = r.nextInt(75);
        }

        System.out.println("Antes de ordenar");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
        }
        System.out.println();
      
        for (int i = 1; i < vetor.length; i++) {
              for (int j = 0; j < vetor.length; j++) {
                  if (vetor[i] < vetor[j]) {
                      int aux = vetor[i];
                      vetor[i] = vetor[j];
                      vetor[j] = aux;
                  }
              }
          }


        System.out.println("Depois de ordenar");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
        }
        System.out.println();

    }
}

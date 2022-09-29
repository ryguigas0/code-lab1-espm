package codelab.aula0;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double[] temperaturas = new double[7];
        String[] diasSemana = { "domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sábado" };

        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < temperaturas.length; i++) {
            String dia = diasSemana[i];

            System.out.print("Digite a temperatura (em °C) no(a) " + dia + " --> ");
            temperaturas[i] = kb.nextDouble();
        }

        kb.close();

        double soma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;

        System.out.println("Temperaturas acima da media (" + String.format("%.2f", media) + ")");

        for (int i = 0; i < temperaturas.length; i++) {
            double valor = temperaturas[i];

            if (valor <= media) {
                continue;
            }

            String dia = diasSemana[i];

            System.out.println(dia + " --> " + String.format("%.2f", valor));
        }
    }
}

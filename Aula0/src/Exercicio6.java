import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int salas;

        Scanner kb = new Scanner(System.in);

        System.out.print("Digite a quantidade de salas --> ");
        salas = kb.nextInt();

        for (int i = 0; i < salas; i++) {
            System.out.print("Digite a quantidade de alunos --> ");
            int totalAlunos = kb.nextInt(), soma = 0;

            int[] notasAlunos = new int[totalAlunos];

            for (int j = 0; j < notasAlunos.length; j++) {
                int nota;
                System.out.print("Digite a nota do aluno" + (j + 1) + " (entre 0 e 100) --> ");
                nota = kb.nextInt();

                notasAlunos[j] = nota;

                soma += nota;
            }

            double media = soma / totalAlunos;

            int totalAcimaMedia = 0;

            for (int j = 0; j < notasAlunos.length; j++) {
                if (notasAlunos[j] > media) {
                    totalAcimaMedia++;
                }
            }

            double percentagem = totalAcimaMedia * 100.0 / totalAlunos;

            System.out.println("A porcentagem de alunos acima da média é --> " + String.format("%.3f", percentagem));
        }

        kb.close();
    }
}

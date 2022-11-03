package codelab.aula6.exemplo;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Aluno[] alunos = new Aluno[1]; // Instancia só o array, não os objetos

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("-------------------------");
            alunos[i] = new Aluno();

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i].nome = kb.nextLine();

            System.out.print("Digite o registro do aluno " + (i + 1) + ": ");
            alunos[i].registro = kb.nextInt();

            kb.nextLine();

            System.out.print("Digite a data de nascimento do aluno " + (i + 1) + ": ");
            alunos[i].dataNascimento = kb.nextLine();

            System.out.print("Digite o cpf do aluno " + (i + 1) + ": ");
            alunos[i].cpf = kb.nextLine();

            System.out.print("Digite a nota1 do aluno " + (i + 1) + ": ");
            alunos[i].nota1 = kb.nextDouble();

            System.out.print("Digite o nota2 do aluno " + (i + 1) + ": ");
            alunos[i].nota2 = kb.nextDouble();

            kb.nextLine();
        }

        kb.close();

        for (int i = 0; i < alunos.length; i++) {
            alunos[i].printaAluno();
        }
    }
}

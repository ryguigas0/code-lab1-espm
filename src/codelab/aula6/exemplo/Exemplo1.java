package codelab.aula6.exemplo;

public class Exemplo1 {

    public static void main(String[] args) {

        Aluno a = new Aluno();

        a.printaAluno();

        a.registro = 203491;
        a.nome = "Guilherme Oliveira Casagrande";
        a.dataNascimento = "12/08/2003";
        a.cpf = "12345678912";
        a.nota1 = 10;
        a.nota2 = 7.9;

        a.printaAluno();

        System.out.println("Média de nota: " + a.calcMedia());
        System.out.println("Situação do aluno: " + a.retornaSituacao());
    }
}

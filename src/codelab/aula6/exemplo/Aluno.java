package codelab.aula6.exemplo;

public class Aluno {
    int registro;
    String nome;
    String dataNascimento;
    String cpf;
    double nota1;
    double nota2;

    public void printaAluno() {
        System.out.println("------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("RA: " + this.registro);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Média das notas: " + this.calcMedia());
        System.out.println("Situação: " + this.retornaSituacao());
    }

    public double calcMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String retornaSituacao() {
        return (calcMedia() >= 7 ? "alfa" : "betinha");
    }
}

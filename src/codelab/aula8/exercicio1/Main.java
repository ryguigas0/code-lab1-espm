package codelab.aula8.exercicio1;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor();

        p.cpf = "123456789-12";
        p.nome = "Guilherme";
        p.totalAulasSemanais = 45;
        p.valorHoraAula = 55.5;

        System.out.println("Salário mensal do professor " + p.nome + " é: " + p.salarioMensal());
        System.out.println(p.professorString());
    }
}
package codelab.aula8.exercicio2;

public class Professor {
    String cpf;
    String nome;
    int totalAulasSemanais;
    double valorHoraAula;

    public double salarioMensal() {
        double sb = totalAulasSemanais * 4.5 * valorHoraAula;

        double ha = sb * 0.05;

        double dsr = (sb + ha) / 6;

        return sb + ha + dsr;
    }

    public String professorString() {
        return String.format("Nome: %s\nCPF: %s\nSalário mensal: R$%.2f\n", nome, cpf, salarioMensal());
    }
}

package codelab.aula8.exercicio2;

import static javax.swing.JOptionPane.*;

public class Sistema {
    private Professor[] professores = new Professor[5];
    private int posicao = 0;

    private void registrarProfessor(String cpf, String nome, int totalAulasSemanais, double valorHoraAula) {
        Professor novo = new Professor();
        novo.nome = nome;
        novo.cpf = cpf;
        novo.totalAulasSemanais = totalAulasSemanais;
        novo.valorHoraAula = valorHoraAula;
        professores[posicao] = novo;
        posicao++;

    }

    private Professor buscaProfessor(String cpfBusca) {
        for (int i = 0; i <= posicao; i++) {
            if (professores[i] != null && professores[i].cpf.equals(cpfBusca)) {
                return professores[i];
            }
        }

        return null;
    }

    private String listarProfessores() {
        String output = "";

        for (int i = 0; i < professores.length; i++) {
            if (professores[i] != null) {
                output += professores[i].professorString() + "\n";
            }
        }

        return output;
    }

    public void iniciarMenu() {
        String titulo = "Registro de professores";

        do {
            String input = showInputDialog(null,
                    "Escolha uma operação\n1 - Cadastrar\n2 - Pesquisar\n3- Listar\n4 - sair", titulo);
            switch (input) {
                case "1":
                    if (posicao >= professores.length) {
                        showMessageDialog(null, "LIMITE DE PROFESSORES DE " + professores.length + " FOI ALCANÇADO");
                        continue;
                    }

                    String cpf = showInputDialog("Digite o cpf do professor");

                    if (buscaProfessor(cpf) != null) {
                        showMessageDialog(null, "CPF " + cpf + " JÁ EXISTE");
                        continue;
                    }

                    String nome = showInputDialog("Digite o nome do professor");

                    int totalAulasSemanais = Integer
                            .parseInt(showInputDialog("Digite a quantidade de aulas semanais"));

                    double valorHoraAula = Double
                            .parseDouble(showInputDialog("Digite o valor da hora aula do professor"));

                    registrarProfessor(cpf, nome, totalAulasSemanais, valorHoraAula);

                    showMessageDialog(null, "PROFESSOR REGISTRADO");

                    break;
                case "2":
                    String cpfBusca = showInputDialog(null, "Digite um cpf para buscar");
                    Professor p = buscaProfessor(cpfBusca);

                    if (p == null) {
                        showMessageDialog(null, "PROFESSOR COM CPF " + cpfBusca + " NÃO ENCONTRADO");
                    } else {
                        showMessageDialog(null, p.professorString());
                    }

                    break;

                case "3":
                    showMessageDialog(null, listarProfessores());
                    break;
                case "4":
                    return;

                default:
                    showMessageDialog(null, "Digite uma opção válida");
                    break;
            }
        } while (true);
    }
}

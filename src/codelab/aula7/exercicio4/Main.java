package codelab.aula7.exercicio4;

import java.util.Scanner;

public class Main {
    // Baixa -> quantidade vendida

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        Registro[] registros = new Registro[5];

        for (int i = 0; i < registros.length; i++) {
            System.out.println("--------- CRIANDO REGISTRO ---------");
            System.out.print("Digite o nome do produto: ");
            String nome = kb.nextLine();

            System.out.print("Digite o preco do produto: ");
            double preco = kb.nextDouble();

            kb.nextLine();

            registros[i] = Registro.criarRegistro(nome, preco);

            registros[i].printarRegistro();
        }

        Registro regMaisBaixas = new Registro();
        int maiorSomaBaixasSemestre = 0;

        for (int i = 0; i < registros.length; i++) {
            int somaSemestre = 0;

            for (int j = 0; j < registros[i].baixas.length; j++) {
                for (int k = 0; k < registros[i].baixas[j].length; k++) {
                    somaSemestre += registros[i].baixas[j][k];
                }
            }

            if (somaSemestre > maiorSomaBaixasSemestre) {
                maiorSomaBaixasSemestre = somaSemestre;
                regMaisBaixas = registros[i];
            }
        }

        System.out.println("Registro do produto com a maior quantidade de baixas: ");
        regMaisBaixas.printarRegistro();

    }
}

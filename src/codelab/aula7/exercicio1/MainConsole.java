package codelab.aula7.exercicio1;

import java.util.Scanner;

public class MainConsole {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 5;

        // do {
        // System.out.print("Digite a quantidade de passagens: ");
        // n = kb.nextInt();
        // } while (n <= 0);

        // kb.nextLine();

        Passagem[] passagens = new Passagem[n];

        for (int i = 0; i < passagens.length; i++) {
            System.out.println("----------- DADOS PASSAGEM " + (i + 1) + " -----------");

            System.out.println("Digite o nome do passageiro:");
            String nomePassageiro = kb.nextLine();

            int idadePassageiro = 0;
            do {
                System.out.print("Digite a idade de " + nomePassageiro + ": ");
                idadePassageiro = kb.nextInt();
            } while (idadePassageiro <= 0 || idadePassageiro > 110);

            kb.nextLine();

            System.out.println("Digite o destino da passagem:");
            String destino = kb.nextLine();

            passagens[i] = Passagem.criarPassagem(nomePassageiro, idadePassageiro, destino);
        }

        int soma = 0;
        for (int i = 0; i < passagens.length; i++) {
            passagens[i].printarPassagem();
            soma += passagens[i].idadePassageiro;
        }
        int media = soma / passagens.length;

        System.out.println("-----------------------------------------");

        System.out.println("Media de idade dos passageiros: " + media + " anos");
        for (int i = 0; i < passagens.length; i++) {
            if (passagens[i].idadePassageiro > media) {
                System.out.println("Passageiro(a) " + passagens[i].nomePassageiro + " está acima da média");
            }
        }
    }
}
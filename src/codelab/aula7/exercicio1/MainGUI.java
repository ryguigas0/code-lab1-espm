package codelab.aula7.exercicio1;

import javax.swing.JOptionPane;

public class MainGUI {

    public static void main(String[] args) {
        int n = 5;

        Passagem[] passagens = new Passagem[n];

        for (int i = 0; i < passagens.length; i++) {
            passagens[i] = Passagem.criarPassagemGUI();
        }

        int soma = 0;
        for (int i = 0; i < passagens.length; i++) {
            soma += passagens[i].idadePassageiro;
        }
        int media = soma / passagens.length;

        String passageirosAcima = "";

        for (int i = 0; i < passagens.length; i++) {
            if (passagens[i].idadePassageiro > media) {
                passageirosAcima += passagens[i].nomePassageiro + "\n";
            }
        }

        JOptionPane.showMessageDialog(null,
                "Os passageiros que tem idade acima da média (" + media + " anos ) são:\n" + passageirosAcima);
    }
}
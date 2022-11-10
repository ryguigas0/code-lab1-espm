package codelab.aula7.exercicio1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Passagem {
    int numero;
    String destino;
    int idadePassageiro;
    String nomePassageiro;

    private static int gerarNumeroPassagem() {
        Random r = new Random();

        return r.nextInt(9999999);
    }

    static Passagem criarPassagem(String nomePassageiro, int idadePassageiro, String destino) {
        Passagem p = new Passagem();

        p.numero = gerarNumeroPassagem();
        p.nomePassageiro = nomePassageiro;
        p.idadePassageiro = idadePassageiro;
        p.destino = destino;

        return p;
    }

    void printarPassagem() {
        System.out.println("---------- PASSAGEM " + this.numero + " -------------");
        System.out.println("NUMERO: " + this.numero);
        System.out.println("NOME PASSAGEIRO: " + this.nomePassageiro);
        System.out.println("IDADE PASSAGEIRO: " + this.idadePassageiro);
        System.out.println("DESTINO: " + this.destino);
    }

    static Passagem criarPassagemGUI() {

        String nomePassageiro = JOptionPane.showInputDialog(null, "Digite o nome do passgeiro");

        int idadePassageiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do passageiro"));

        String destino = JOptionPane.showInputDialog(null, "Digite o destino da passagem");

        return Passagem.criarPassagem(nomePassageiro, idadePassageiro, destino);
    }
}

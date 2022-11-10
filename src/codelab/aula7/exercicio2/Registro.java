package codelab.aula7.exercicio2;

import java.util.Random;

public class Registro {
    int codigo;
    String nome;
    double preco;
    int[] baixas = new int[4];

    static int gerarCodigo() {
        Random r = new Random();

        return r.nextInt(1000, 9999);
    }

    static int gerarBaixaEstoque() {
        Random r = new Random();

        return r.nextInt(0, 100);
    }

    static Registro criarRegistro(String nome, double preco) {
        Registro r = new Registro();

        r.codigo = gerarCodigo();
        r.nome = nome;
        r.preco = preco;

        for (int i = 0; i < r.baixas.length; i++) {
            r.baixas[i] = gerarBaixaEstoque();
        }

        return r;
    }

    void printarRegistro() {
        System.out.println("--------- REGISTRO " + this.codigo + " ---------");
        System.out.println("NOME PRODUTO: " + this.nome);
        System.out.println("PRECO PRODUTO: " + this.preco);

        System.out.println("Baixas da semana");
        for (int i = 0; i < this.baixas.length; i++) {
            System.out.println("Semana " + (i + 1) + ": " + this.baixas[i]);
        }
    }

}

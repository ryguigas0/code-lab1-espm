package codelab.aula7.exercicio4;

import java.util.Random;

public class Registro {
    int codigo;
    String nome;
    double preco;
    int[][] baixas = new int[6][4];

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
            for (int j = 0; j < r.baixas[j].length; j++) {
                r.baixas[i][j] = gerarBaixaEstoque();
            }
        }

        return r;
    }

    void printarRegistro() {
        System.out.println("--------- REGISTRO " + this.codigo + " ---------");
        System.out.println("NOME PRODUTO: " + this.nome);
        System.out.println("PRECO PRODUTO: " + this.preco);

        System.out.println("Baixas do semestre");
        for (int i = 0; i < baixas.length; i++) {
            System.out.println("MÊS " + (i + 1));
            for (int j = 0; j < this.baixas[i].length; j++) {
                System.out.println("Semana " + (j + 1) + ": " + this.baixas[i][j]);
            }
        }
    }

}

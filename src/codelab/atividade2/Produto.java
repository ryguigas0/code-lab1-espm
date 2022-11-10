package codelab.atividade2;

public class Produto {
    String nome;
    int quantidade;
    double valorUnidade;

    static Produto criarProduto(String nome, int quantidade, double valorUnidade) {
        Produto p = new Produto();

        p.nome = nome;
        p.quantidade = quantidade;
        p.valorUnidade = valorUnidade;

        return p;
    }

    public void printarProduto() {
        System.out.println(String.format("NOME: %s\nQUANTIDADE: %d\nVALOR UNID %.2f", this.nome, this.quantidade,
                this.valorUnidade));
    }
}
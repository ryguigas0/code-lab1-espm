package codelab.atividade2.exercicio1;

import java.util.Scanner;

public class Sistema {
    Produto[] produtos = new Produto[10];
    static Scanner kb = new Scanner(System.in);

    void cadastrarProduto() {
        System.out.println("------ CADASTRO DE PRODUTO ------");

        int indexDisponivel = -1;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                indexDisponivel = i;
                break;
            }
        }

        if (indexDisponivel < 0) {
            System.out.println("Não há espaço disponível!");
        }

        String nome = inputString("Digite o nome do produto: ");
        int quantidade = inputInt("Digite a quantidade em unidade do produto: ");
        double precoUnid = inputDouble("Digite o preco da unidade do produto: ");

        produtos[indexDisponivel] = Produto.criarProduto(nome, quantidade, precoUnid);
    }

    void listarProdutos() {
        System.out.println("------------ LISTAGEM DE PRODUTOS ------------");
        for (int i = 0; i < this.produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println("---> Produto " + (i + 1));
                produtos[i].printarProduto();
            }
        }
    }

    void deletarProduto() {
        System.out.println("-------- DELETAR PRODUTO ----------");
        String nomeBusca = inputString("Digite o nome do produto para deletar: ");

        Produto produto = buscaProduto(produtos, nomeBusca);

        if (produto == null) {
            System.out.println("PRODUTO " + nomeBusca + " NÃO ENCONTRADO!");
        } else {
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i] != null && produtos[i].nome.equals(produto.nome)) {
                    System.out.println("PRODUTO '" + produtos[i].nome + "' FOI DELETADO");
                    produtos[i] = null;
                    break;
                }
            }
        }
    }

    void pesquisarProduto() {
        System.out.println("-------- PESQUISA DE PRODUTO ---------");
        String nomeBuscado = inputString("Digite o nome do produto para buscar: ");

        Produto produtoEncontrado = buscaProduto(produtos, nomeBuscado);

        if (produtoEncontrado == null) {
            System.out.println("PRODUTO '" + nomeBuscado + "' NÃO ENCONTRADO!");
        } else {
            produtoEncontrado.printarProduto();
        }
    }

    static private Produto buscaProduto(Produto[] produtos, String nomeBuscado) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].nome.equalsIgnoreCase(nomeBuscado)) {
                return produtos[i];
            }
        }

        return null;
    }

    static double inputDouble(String msg) {
        System.out.print(msg);
        double out = kb.nextDouble();

        kb.nextLine();

        return out;
    }

    static int inputInt(String msg) {
        System.out.print(msg);
        int out = kb.nextInt();

        kb.nextLine();

        return out;
    }

    static String inputString(String msg) {
        System.out.print(msg);
        String out = kb.nextLine();

        return out;
    }
}

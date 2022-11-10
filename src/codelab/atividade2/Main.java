package codelab.atividade2;

import java.util.Scanner;

public class Main {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        Produto[] produtos = new Produto[10];

        boolean repetir = true;
        while (repetir) {
            repetir = loop(true, produtos);
        }
    }

    static boolean loop(boolean repetir, Produto[] produtos) {
        System.out.println("-----------------------");
        System.out.println(
                "1.  Cadastrar produto\n2.  Pesquisar produto\n3.  Listar produto\n4.  Excluir produto\n5.  Finalizar");
        int opt = inputInt("Digite uma opção: ");
        switch (opt) {
            case 1:
                produtos = cadastrarProduto(produtos);
                break;

            case 2:
                pesquisarProduto(produtos);
                break;

            case 3:
                listarProdutos(produtos);
                break;

            case 4:
                produtos = deletarProduto(produtos);
                break;

            case 5:
                repetir = false;
                break;

            default:
                System.out.println("Opção não reconhecida");
                break;
        }

        return repetir;
    }

    private static Produto[] deletarProduto(Produto[] produtos) {
        System.out.println("-------- DELETAR PRODUTO ----------");
        String nomeBusca = inputString("Digite o nome do produto para deletar: ");

        Produto produto = buscaProduto(produtos, nomeBusca);

        if (produto == null) {
            System.out.println("PRODUTO " + nomeBusca + " NÃO ENCONTRADO!");
        } else {
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i] != null && produtos[i].nome.equals(produto.nome)) {
                    produtos[i] = null;
                    break;
                }
            }
        }

        return produtos;
    }

    private static void listarProdutos(Produto[] produtos) {
        System.out.println("------------ LISTAGEM DE PRODUTOS ------------");
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println("---> Produto " + (i + 1));
                produtos[i].printarProduto();
            }
        }
    }

    private static void pesquisarProduto(Produto[] produtos) {
        System.out.println("-------- PESQUISA DE PRODUTO ---------");
        String nomeBuscado = inputString("Digite o nome do produto para buscar: ");

        Produto produtoEncontrado = buscaProduto(produtos, nomeBuscado);

        if (produtoEncontrado == null) {
            System.out.println("PRODUTO " + nomeBuscado + " NÃO ENCONTRADO!");
        } else {
            produtoEncontrado.printarProduto();
        }
    }

    static Produto[] cadastrarProduto(Produto[] produtos) {
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
            return produtos;
        }

        String nome = inputString("Digite o nome do produto: ");
        int quantidade = inputInt("Digite a quantidade em unidade do produto: ");
        double precoUnid = inputDouble("Digite o preco da unidade do produto: ");

        produtos[indexDisponivel] = Produto.criarProduto(nome, quantidade, precoUnid);

        return produtos;
    }

    static private Produto buscaProduto(Produto[] produtos, String nomeBuscado) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].nome.equalsIgnoreCase(nomeBuscado)) {
                return produtos[i];
            }
        }

        return null;
    }

    private static double inputDouble(String msg) {
        System.out.print(msg);
        double out = kb.nextDouble();

        kb.nextLine();

        return out;
    }

    private static int inputInt(String msg) {
        System.out.print(msg);
        int out = kb.nextInt();

        kb.nextLine();

        return out;
    }

    private static String inputString(String msg) {
        System.out.print(msg);
        String out = kb.nextLine();

        return out;
    }

}

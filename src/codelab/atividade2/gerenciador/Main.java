package codelab.atividade2.gerenciador;

public class Main {

    public static void main(String[] args) {

        Sistema sist = new Sistema();

        boolean repetir = true;
        while (repetir) {
            repetir = loop(true, sist);
        }
    }

    static boolean loop(boolean repetir, Sistema sist) {
        System.out.println("-----------------------");
        System.out.println(
                "1.  Cadastrar produto\n2.  Pesquisar produto\n3.  Listar produto\n4.  Excluir produto\n5.  Finalizar");
        int opt = Sistema.inputInt("Digite uma opção: ");
        switch (opt) {
            case 1:
                sist.cadastrarProduto();
                break;

            case 2:
                sist.pesquisarProduto();
                break;

            case 3:
                sist.listarProdutos();
                break;

            case 4:
                sist.deletarProduto();
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

}

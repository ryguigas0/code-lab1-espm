import java.util.Scanner;

public class Exercicio4 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        // 5 vendedores OK
        // com 1 nome cada OK
        // com 6 (1 semestre) vendas cada OK

        // imprimir
        // - A soma total de vendas
        // - Cada venda por mês
        // - Nome do vendedor com mais vendas
        // - Nome do vendedor com menos vendas

        String[] nomesVendedores = new String[5];
        int[][] vendas = new int[5][6];

        for (int i = 0; i < nomesVendedores.length; i++) {
            System.out.print("Digite o nome do(a) vendedor(a) " + (i + 1) + ": ");
            nomesVendedores[i] = kb.nextLine();
        }

        for (int i = 0; i < nomesVendedores.length; i++) {
            System.out.println("Para o vendedor(a) " + nomesVendedores[i]);
            for (int iVenda = 0; iVenda < vendas[i].length; iVenda++) {
                System.out
                        .print("Digite o valor total das vendas do mês " + (iVenda + 1) + " do primeiro semestre: ");
                vendas[i][iVenda] = kb.nextInt();
            }
        }

        System.out.println("-----------------");
        System.out.println(" Relatório final");
        System.out.println("-----------------");

        int maiorSoma = 0, menorSoma = -1;
        int vendedorMaior = 0, vendedorMenor = 0;

        System.out.println("Vendedor | Mês 1 | Mês 2 | Mês 3 | Mês 4 | Mês 5 | Mês 6 | Soma");
        for (int i = 0; i < vendas.length; i++) {
            int soma = 0;

            for (int j = 0; j < vendas.length; j++) {
                soma += vendas[i][j];
            }

            if (soma > maiorSoma) {
                maiorSoma = soma;
                vendedorMaior = i;
            }

            if (menorSoma == -1 || soma < menorSoma) {
                menorSoma = soma;
                vendedorMenor = i;
            }

            printarLinhaRelatorio(nomesVendedores[i], vendas[i], soma);
        }

        System.out.println("Vendedor com mais vendas: " + nomesVendedores[vendedorMaior] + " (" + maiorSoma + ")");
        System.out.println("Vendedor com menos vendas: " + nomesVendedores[vendedorMenor] + " (" + menorSoma + ")");

    }

    private static void printarLinhaRelatorio(String nomeVendedor, int[] vendas, int soma) {
        String saida = String.format("%s | %d | %d | %d | %d | %d | %d | %d",
                nomeVendedor, vendas[0], vendas[1], vendas[2], vendas[3], vendas[4], vendas[5], soma);

        System.out.println(saida);
    }

}

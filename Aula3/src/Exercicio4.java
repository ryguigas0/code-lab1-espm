import java.util.Scanner;

public class Exercicio4 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho" };

        System.out.print("Quantos vendedores são? ");
        int quantVendedores = kb.nextInt();

        kb.nextLine();

        String[] nomesVendedores = new String[quantVendedores];
        int[][] vendas = new int[quantVendedores][7];

        for (int i = 0; i < nomesVendedores.length; i++) {
            System.out.print("Digite o nome do(a) vendedor(a) " + (i + 1) + ": ");
            nomesVendedores[i] = kb.nextLine();
        }

        for (int i = 0; i < nomesVendedores.length; i++) {
            System.out.println("Para o vendedor(a) " + nomesVendedores[i]);
            for (int venda = 0; venda < meses.length; venda++) {
                System.out
                        .print("Digite o valor total das vendas de " + meses[venda] + ": ");
                vendas[i][venda] = kb.nextInt();
                vendas[i][6] += vendas[i][venda];
            }
        }

        System.out.println("-----------------");
        System.out.println(" Relatório final");
        System.out.println("-----------------");

        System.out.print("Vendedor | ");
        for (int i = 0; i < meses.length; i++) {
            System.out.print(meses[i] + " | ");
        }
        System.out.println("Soma");

        int maiorSoma = 0, menorSoma = -1;
        int vendedorMaior = 0, vendedorMenor = 0;

        for (int i = 0; i < vendas.length; i++) {
            int soma = vendas[i][6];

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

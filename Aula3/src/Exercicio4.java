import java.util.Scanner;

public class Exercicio4 {

    static Scanner kb = new Scanner(System.in);
    static String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho" };

    public static void main(String[] args) {

        System.out.print("Quantos vendedores são? ");
        int quantVendedores = kb.nextInt();

        kb.nextLine();

        String[] nomesVendedores = new String[quantVendedores];
        double[][] vendas = new double[quantVendedores][7];

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

        double maiorSoma = 0;
        double menorSoma = -1;
        int vendedorMaior = 0, vendedorMenor = 0;

        for (int i = 0; i < vendas.length; i++) {
            double soma = vendas[i][6];

            if (soma > maiorSoma) {
                maiorSoma = soma;
                vendedorMaior = i;
            }

            if (menorSoma == -1 || soma < menorSoma) {
                menorSoma = soma;
                vendedorMenor = i;
            }

            printarLinhaRelatorio(nomesVendedores[i], vendas[i]);
        }
        printarSomaPorMes(vendas);

        System.out.println("Vendedor com mais vendas: " + nomesVendedores[vendedorMaior] + " (" + maiorSoma + ")");
        System.out.println("Vendedor com menos vendas: " + nomesVendedores[vendedorMenor] + " (" + menorSoma + ")");

    }

    private static void printarSomaPorMes(double[][] vendas) {
        double total = 0;
        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < vendas.length; j++) {
                total += vendas[j][i];
            }
            System.out.print(" | " + total);
            total = 0;
        }
        System.out.println();
    }

    private static void printarLinhaRelatorio(String nomeVendedor, double[] vendas) {
        System.out.print(nomeVendedor);

        for (int i = 0; i < vendas.length; i++) {
            System.out.print(" | " + vendas[i]);
        }
        System.out.println();
    }

}

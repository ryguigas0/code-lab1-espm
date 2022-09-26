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
        double[][] vendas = new double[5][6];

        for (int i = 0; i < nomesVendedores.length; i++) {
            System.out.print("Digite o nome do(a) vendedor(a) " + (i + 1) + ": ");
            nomesVendedores[i] = kb.nextLine();
        }

        for (int i = 0; i < nomesVendedores.length; i++) {
            System.out.println("Para o vendedor(a) " + nomesVendedores[i]);
            for (int iVenda = 0; iVenda < vendas[i].length; iVenda++) {
                System.out
                        .println("Digite o valor total das vendas do mês " + (iVenda + 1) + " do primeiro semestre: ");
                kb.nextDouble();
            }
        }

    }
}

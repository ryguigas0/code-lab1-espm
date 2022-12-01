package codelab.prova2;

public class Sistema {

    // Exercicio 2

    private Cliente[] clientesMemoria = new Cliente[5];
    double conversaoMinutosReais = 0.5;

    public void armazenarNovoCliente(Cliente novoCliente) {
        for (int i = 0; i < clientesMemoria.length; i++) {
            if (clientesMemoria[i] == null) {
                clientesMemoria[i] = novoCliente;
                System.out.println("CLIENTE " + novoCliente.nome + " ARMAZENADO");
                return;
            }
        }
        System.out.println("LIMITE DE " + clientesMemoria.length + " CLIENTES ATINGIDO");
    }

    // Exercicio 3
    public void printarAlugueis() {
        for (int i = 0; i < clientesMemoria.length; i++) {
            double valorPagamento = clientesMemoria[i].tempoMinutosAluguel * conversaoMinutosReais;
            System.out.println(
                    String.format("NOME USUÁRIO: %s | VALOR PAGO: R$%.2f", clientesMemoria[i].nome, valorPagamento));
        }
    }

    private double converterMinutosParaReais(int minutos) {
        return minutos * conversaoMinutosReais;
    }

    // Exercicio 4
    public void printarClienteMaiorTempoAlugado() {
        int indClienteMaiorTempo = 0;
        for (int i = 1; i < clientesMemoria.length; i++) {
            if (clientesMemoria[indClienteMaiorTempo].tempoMinutosAluguel < clientesMemoria[i].tempoMinutosAluguel) {
                indClienteMaiorTempo = i;
            }
        }
        System.out.println(
                String.format("NOME USUÁRIO COM MAIOR TEMPO ALUGADO: %s | TEMPO: %d mins",
                        clientesMemoria[indClienteMaiorTempo].nome,
                        clientesMemoria[indClienteMaiorTempo].tempoMinutosAluguel));
        ;
    }

    // Exercicio 5
    public void printarTotalRecebimentoAlugueis() {
        double total = 0;
        for (int i = 0; i < clientesMemoria.length; i++) {
            total += converterMinutosParaReais(clientesMemoria[i].tempoMinutosAluguel);
        }
        System.out.println(String.format("TOTAL DE RECEBIMENTOS DOS ALUGUEIS: R$%.2f", total));
    }
}

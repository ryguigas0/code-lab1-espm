package codelab.prova2;

public class Main {
    public static void main(String[] args) {
        Sistema sist = new Sistema();

        for (int i = 0; i < 6; i++) {
            Cliente c = new Cliente();
            c.nome = "TEST" + i;
            c.cpf = "CPF" + i;
            c.tempoMinutosAluguel= 100 * (i + 1);
            sist.armazenarNovoCliente(c);
        }

        sist.printarAlugueis();

        sist.printarClienteMaiorTempoAlugado();

        sist.printarTotalRecebimentoAlugueis();
    }
}

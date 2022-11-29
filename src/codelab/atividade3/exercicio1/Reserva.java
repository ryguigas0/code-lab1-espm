package codelab.atividade3.exercicio1;

public class Reserva {
    public String nomeCliente;
    public String telCliente;
    public String formaPagamento;

    public static Reserva criarReserva(String nomeCliente, String telCliente, String formaPagamento) {
        Reserva r = new Reserva();

        r.nomeCliente = nomeCliente;
        r.telCliente = telCliente;
        r.formaPagamento = formaPagamento;

        return r;
    }

    public String stringImprimir() {
        return String.format(
                "Nome cliente: %s\nTelefone cliente:%s\nForma de pagamento: %s",
                nomeCliente, telCliente, formaPagamento);
    }
}

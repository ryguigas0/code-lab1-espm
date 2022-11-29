package codelab.atividade3.exercicio2;

import static javax.swing.JOptionPane.*;

import codelab.atividade3.exercicio1.Reserva;

public class GerenciadorReservas {
    static String inputString = "Restaurante SABOR SOFISTICADO\n1.Reservar mesa\n2.Pesquisar mesa\n3.Imprimir reservas\n4.Imprimir lista de espera\n5.Cancelar reserva\n6.Finalizar";

    Reserva[] reservas = new Reserva[1];
    Reserva[] listaEspera = new Reserva[0];

    public void iniciar() {
        boolean rodar = true;
        do {
            int opt = Integer.parseInt(showInputDialog(null, inputString));
            switch (opt) {
                case 1:
                    criarReserva();
                    break;
                case 2:
                    pesquisarReserva();
                    break;
                case 3:
                    imprimirReservas();
                    break;
                case 4:
                    imprimirListaEspera();
                    break;
                case 5:
                    System.out.println("OPÇÃO 5");
                    break;
                case 6:
                    rodar = false;
                    break;

                default:
                    showMessageDialog(null, "Digite uma opção válida!");
                    break;
            }
        } while (rodar);
    }

    private void imprimirListaEspera() {
        String output = "";

        for (int i = 0; i < listaEspera.length; i++) {
            output += String.format("%s\nPosição: %d\n--------\n", listaEspera[i].stringImprimir(), i);
        }

        showMessageDialog(null, output);
    }

    private void imprimirReservas() {
        String output = "";

        for (int i = 0; i < reservas.length; i++) {
            output += reservas[i].stringImprimir() + "\n--------\n";
        }

        showMessageDialog(null, output);
    }

    private void criarReserva() {
        String nomeCliente = showInputDialog(null, "Digite o nome do cliente");
        String telefoneCliente = showInputDialog(null, "Digite o telefone do cliente");
        String formaPagamento = showInputDialog(null, "Digite a forma de pagamento (vista ou parcelado)");
        Reserva r = Reserva.criarReserva(nomeCliente, telefoneCliente, formaPagamento);

        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                reservas[i] = r;
                showMessageDialog(null, "Reserva criada!");
                return;
            }
        }

        extenderListaEspera(r);
        showMessageDialog(null, "Reserva colocada na lista de espera!");
    }

    private void extenderListaEspera(Reserva r) {
        Reserva[] novaLista = new Reserva[listaEspera.length + 1];

        for (int i = 0; i < listaEspera.length; i++) {
            novaLista[i] = listaEspera[i];
        }

        novaLista[listaEspera.length] = r;

        listaEspera = novaLista;
    }

    private void pesquisarReserva() {
        String telefoneBusca = showInputDialog(null, "Digite o telefone para buscar");

        Reserva r = buscarReserva(telefoneBusca);
        if (r != null) {
            showMessageDialog(null, "Reserva para o jantar encontrada!");
            return;
        }

        int posEspera = buscarListaEspera(telefoneBusca);
        if (posEspera > -1) {
            showMessageDialog(null, "O cliente está na posição " + (posEspera + 1) + " da fila");
            return;
        }

        showMessageDialog(null, "O cliente não tem reserva!");
    }

    private int buscarListaEspera(String telefoneBusca) {
        for (int i = 0; i < listaEspera.length; i++) {
            if (listaEspera[i].telCliente.equals(telefoneBusca)) {
                return i;
            }
        }
        return -1;
    }

    private Reserva buscarReserva(String telefoneBusca) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i].telCliente.equals(telefoneBusca)) {
                return reservas[i];
            }
        }
        return null;
    }
}

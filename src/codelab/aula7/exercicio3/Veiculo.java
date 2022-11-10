package codelab.aula7.exercicio3;

import java.util.Random;

public class Veiculo {
    String nomeProprietario;
    int ano;
    String tipoCombustivel;
    String placa;

    static Veiculo gerarVeiculo() {
        Random r = new Random();
        String[] nomes = { "Guilherme", "Rodrigo", "Selmini" };
        String[] tipoCombustivel = { "alcool", "gasolina", "diesel" };

        return criaVeiculo(nomes[r.nextInt(0, 3)], tipoCombustivel[r.nextInt(0, 3)], gerarPlaca(),
                r.nextInt(1990, 2022));
    }

    static String gerarPlaca() {
        Random r = new Random();
        String placa = String.format("ABC%03d", r.nextInt(100, 1000));

        if (r.nextInt(1, 3) % 2 == 0) {
            placa += "9";
        } else {
            placa += "8";
        }

        return placa;
    }

    static Veiculo criaVeiculo(String nomeProprietario, String tipoCombustivel, String placa, int ano) {
        Veiculo v = new Veiculo();
        v.nomeProprietario = nomeProprietario;

        v.tipoCombustivel = tipoCombustivel;

        v.placa = placa;

        v.ano = ano;

        return v;
    }

    boolean licenciaVeiculoNovembro() {
        return this.placa.endsWith("9");
    }
}

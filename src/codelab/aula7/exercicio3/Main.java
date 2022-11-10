package codelab.aula7.exercicio3;

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[5];

        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i] = Veiculo.gerarVeiculo();
        }

        int quantAlcool = 0, quantGasolina = 0, quantDiesel = 0;
        for (int i = 0; i < veiculos.length; i++) {
            switch (veiculos[i].tipoCombustivel) {
                case "gasolina":
                    quantGasolina++;
                    break;
                case "alcool":
                    quantAlcool++;
                    break;
                case "diesel":
                    quantDiesel++;
                    break;
                default:
                    System.out.println("VEICULO " + veiculos[i].placa + " ESTÁ COM COMBUSTÍVEL IRREGULAR");
                    break;
            }
        }

        System.out.println("----------------------------------");
        System.out.println("Veiculos movidos à: ");
        System.out.println("Diesiel: " + quantDiesel);
        System.out.println("Gasolina: " + quantGasolina);
        System.out.println("Alcool: " + quantAlcool);

        System.out.println("----------------------------------");
        System.out.println("Proprietarios que devem licenciar o seu veículo em novembro");
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i].licenciaVeiculoNovembro()) {
                System.out.println(veiculos[i].nomeProprietario + " " + veiculos[i].placa);
            }
        }
    }
}

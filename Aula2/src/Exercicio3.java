import java.util.Scanner;

public class Exercicio3 {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insira uma data no formato dd/mm/aaaa --> ");
        String inputData = kb.nextLine();

        System.out.println(dataExtenso(inputData));
    }

    private static String dataExtenso(String inputData) {
        String[] dataQuebrada = inputData.split("/");
        String dia = dataQuebrada[0], mes = nomeMes(Integer.parseInt(dataQuebrada[1])), ano = dataQuebrada[2];

        return "Você nasceu em " + dia + " de " + mes + " de " + ano;
    }

    private static String nomeMes(int numMes) {
        String[] mesVetor = {
                "janeiro",
                "fevereiro",
                "março",
                "abril",
                "maio",
                "junho",
                "julho",
                "agosto",
                "setembro",
                "outubro",
                "novembro",
                "dezembro",
        };

        return mesVetor[numMes - 1];
    }
}

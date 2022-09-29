import java.util.Scanner;

public class JogoDaVelha {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] tabuleiro = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
        boolean empatou = true;
        int turno = 0;

        for (; turno < 9 || !empatou; turno++) {
            printarTabuleiro(tabuleiro);

            int jogador = jogadorAtual(turno);
            System.out.println("Vez do jogador " + jogador);

            char icone;
            if (jogador == 1) {
                icone = 'x';
            } else {
                icone = 'o';
            }

            String[] coordsStr = new String[2];
            int y, x;

            do {
                System.out.print("Digite as coordenadas (coluna e linha) da sua jogada entre espaço: ");
                coordsStr = kb.nextLine().split(" ");
                x = Integer.parseInt(coordsStr[0]);
                y = Integer.parseInt(coordsStr[1]);
            } while (!jogadaValida(tabuleiro, x, y));

            atualizarTabuleiro(tabuleiro, x, y, icone);

            if (jogadorVenceu(tabuleiro, icone)) {
                printarTabuleiro(tabuleiro);
                empatou = false;
                break;
            }
        }

        if (empatou) {
            System.out.println("Empate");
        } else {
            System.out.println("Jogador " + jogadorAtual(turno) + " venceu!");
        }

    }

    private static boolean jogadaValida(char[][] tabuleiro, int x, int y) {
        return (x > 0 && x <= 3) && (y > 0 && y <= 3) && tabuleiro[y - 1][x - 1] == ' ';
    }

    private static boolean jogadorVenceu(char[][] tabuleiro, char icone) {
        return checarLinhas(tabuleiro, icone) || checarColunas(tabuleiro, icone) || checarDiagonais(tabuleiro, icone);
    }

    private static boolean checarLinhas(char[][] tabuleiro, char icone) {
        for (int i = 0; i < tabuleiro.length; i++) {
            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][2] == icone) {
                return true;
            }
        }
        return false;
    }

    private static boolean checarColunas(char[][] tabuleiro, char icone) {
        for (int i = 0; i < tabuleiro.length; i++) {
            if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[2][i] == icone) {
                return true;
            }
        }
        return false;
    }

    private static boolean checarDiagonais(char[][] tabuleiro, char icone) {
        return checarDiagonalPrincipal(tabuleiro, icone) || checarDiagonalSecundaria(tabuleiro, icone);
    }

    private static boolean checarDiagonalSecundaria(char[][] tabuleiro, char icone) {
        return tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]
                && tabuleiro[2][0] == icone;
    }

    private static boolean checarDiagonalPrincipal(char[][] tabuleiro, char icone) {
        return tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[2][2] == icone;
    }

    private static int jogadorAtual(int turno) {
        if (turno % 2 == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    private static void atualizarTabuleiro(char[][] tabuleiro, int x, int y, char icone) {
        tabuleiro[y - 1][x - 1] = icone;
    }

    private static void printarTabuleiro(char[][] tabuleiro) {
        System.out.print("    ");
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(i + 1 + "   ");
        }
        System.out.println();
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < tabuleiro.length; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
        }
    }
}

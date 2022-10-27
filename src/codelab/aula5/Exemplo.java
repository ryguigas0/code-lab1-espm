package codelab.aula5;

public class Exemplo {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Resultado do fatorial recursivo: " + fatorialRecursivo(n));
        System.out.println("Resultado do fatorial sem recursão: " + fatorial(n));
    }

    private static double fatorial(int n) {
        double fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    private static double fatorialRecursivo(int n) {
        if (n <= 1) {
            return 1;
        }

        return fatorialRecursivo(n - 1) * n;
    }
}

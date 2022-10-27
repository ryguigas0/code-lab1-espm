package codelab.aula5;

public class Exercicio1 {
    public static void main(String[] args) {

        System.out.println("a) metodo1(1) => " + metodo1(1));
        System.out.println("b) metodo1(3) => " + metodo1(3));
        System.out.println("a) metodo2(2) => " + metodo2(2));
        System.out.println("b) metodo2(3) => " + metodo2(3));
        System.out.println("c) metodo2(10) => " + metodo2(10));
    }

    public static int metodo1(int x) {
        if (x == 1)
            return -x;
        return -5 * metodo1(x - 1) + x;
    }

    public static int metodo2(int n) {
        if (n == 1)
            return 1;
        return (n - 1) * metodo2(n - 1);
    }
}

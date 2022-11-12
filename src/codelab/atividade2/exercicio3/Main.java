package codelab.atividade2.exercicio3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int valor = gerarNumeroAleatorio(30);
        int[] array = gerarArray(10, 30);
        imprimeArray("Antes de organizar:", array);

        array = ordernarArrayCrescente(array);
        imprimeArray("Depois de organizar", array);

        boolean contemElemento = buscar(array, valor, 0, array.length);

        if (contemElemento) {
            System.out.println("O elemento " + valor + " está presente no array!");
        } else {
            System.out.println("O elemento " + valor + " não está presente no array!");

        }
    }

    private static boolean buscar(int[] array, int valor, int pontoInicio, int pontoFim) {
        if (pontoFim == pontoInicio || pontoFim - 1 == pontoInicio) {
            return false;
        }

        int pontoCentral = (pontoFim + pontoInicio) / 2;

        int elemento = array[pontoCentral];

        if (elemento == valor) {
            return true;
        } else if (elemento < valor) {
            pontoInicio = pontoCentral;
        } else if (elemento > valor) {
            pontoFim = pontoCentral;
        }

        return buscar(array, valor, pontoInicio, pontoFim);
    }

    static int[] ordernarArrayCrescente(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        return array;
    }

    static void imprimeArray(String msg, int[] array) {
        System.out.println(msg);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    static int[] gerarArray(int qtd, int limite) {
        int[] nums = new int[qtd];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = gerarNumeroAleatorio(limite);
        }

        return nums;
    }

    static int gerarNumeroAleatorio(int limite) {
        Random r = new Random();

        return r.nextInt(limite);
    }
}

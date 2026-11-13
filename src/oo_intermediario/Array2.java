package oo_intermediario;

public class Array2 {
    public static void main(String[] args) {
        int[] notas = {5, 6, 7, 8};

        System.out.println("Tamanho do array: " + notas.length); //length = comprimento; vai dar o numero de elementos do array

        System.out.println("\nNotas ordem crescente");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(i + "ª nota: " + notas[i]);
        }

        System.out.println("\nNotas ordem decrescente");
        for (int i = (notas.length-1); i >= 0; i--) {
            System.out.println(i + "ª nota: " + notas[i]);
        }

        int soma = 0;
        for (int i = 0; i < notas.length; i++){
            soma += notas[i]; //mesma coisa que: soma = soma + notas[i];
        }

        double media = (double)soma / notas.length; // coloca o (double) para converter int para double momentaneamente

        System.out.printf("\nMédia: %.2f", media);
    }
}

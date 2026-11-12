package oo_intermediario;

public class Array1 {
    public static void main(String[] args){
        final int TAMANHO = 5;
        int[] notas = new int[TAMANHO];
        notas[0] = 5;
        notas[1] = 6;
        notas[2] = 7;
        notas[3] = 8;
        notas[4] = 9;

        System.out.println(notas[2]);

        for(int i = 0; i < TAMANHO; i++){
            System.out.println(i + "ª nota: " + notas[i]);
        }
    }
}

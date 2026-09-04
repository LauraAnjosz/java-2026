package basico;

public class Basico {
    public static void main(String[] args){
        System.out.println("Lista de 1 até 10");
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
        }

        System.out.println("\n\nLista de 10 até 1");
        for (int i=10;i>=1;i--){
            System.out.print(i+" ");
        }

        System.out.println("\n\nLista crescente com while()");
        int n=1;
        while(n<=10){
            System.out.println(n);
            n++;
        }

        System.out.println("\n\nLista descrescente com while()");
        n=10;
        while(n>=1){
            System.out.println(n);
            n--;
        }
    }
}

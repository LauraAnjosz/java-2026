package basico;
import java.util.Scanner;

public class Decisao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe uma nota de 0 a 10: ");
        int nota=entrada.nextInt();

        if(nota>=7){
            System.out.println("Passou Direto");
        }else if(nota>=4) {
            System.out.println("Exame");
        }else{
            System.out.println("Reprovado");
        }
    }
}

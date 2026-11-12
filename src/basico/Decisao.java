package basico;
import java.util.Scanner;

public class Decisao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Informe uma nota de 0 a 10 (Digite -1 para finalizar): ");
            nota = entrada.nextInt();

            if(nota<-1 || nota>10){
                System.out.println("Valor inválido!");
                continue;
            }

            if(nota==-1){
                System.out.println("FIM");
                break;
            }

            if (nota>=7) {
                System.out.println("Passou Direto");
            } else if (nota>=4 && nota<7) {
                System.out.println("Exame");
            } else {
                System.out.println("Reprovado");
            }
        }while(nota!=-1);
    }
}

package associacoes;

public class testaAssociacao {
    public static void main(String[] args){
        Funcionario mayco = new Funcionario("Mayco Nunes", "Prof. Dr. ");

        System.out.println(mayco.nomeCompleto());
        System.out.println(mayco);

        Empresa cesmo = new Empresa("CESMO", "DER", false);

        cesmo.setDiretor(mayco);

        System.out.println("Diretor do CESMO: " + cesmo.getDiretor().nomeCompleto());
        cesmo.setDiretor(null);
        if(cesmo.getDiretor() == null){
            System.out.println("CESMO atualmente sem diretor");
        }else{
            System.out.println("Diretor do CESMO: " + cesmo.getDiretor().nomeCompleto());
        }

        Funcionario arnaldo = new Funcionario("Arnaldo Lima", "Prof. Dr. ");
        System.out.println("Diretor do CESMO: " + cesmo.getDiretor().nomeCompleto());
    }
}

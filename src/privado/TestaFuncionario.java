package privado;

public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario fulano = new Funcionario("Fulano da Silva", 47, 1234.56);
        /*fulano.setNome("Fulano da Silva");
        fulano.setIdade(47);
        fulano.setSalario(5780.86);*/

        System.out.println("Nome: "+fulano.getNome());
        System.out.println("Idade: "+fulano.getIdade()+" anos");
        System.out.println("Salário: R$"+fulano.getSalario());
    }
}

package estatico;

public class TestaUtils {
    public static void main(String[] args){
        System.out.println(Utils.PI);
        System.out.println(Utils.max(100, 50));
        System.out.println(Utils.max(-5,-3));
        System.out.println(Utils.min(9, 6));

        System.out.println("Quantidade de alunos: " + Aluno.quantidadeAlunos);

        Aluno ze = new Aluno();
        Aluno maria = new Aluno();
        System.out.println("Quantidade de alunos: " + Aluno.quantidadeAlunos);
    }
}

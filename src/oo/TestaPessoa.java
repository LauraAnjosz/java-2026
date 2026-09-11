package oo;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();
        fulano.nome = "Fulano da Silva";
        fulano.idade = 18;
        fulano.peso = 80.5;
        // %d int
        // %f double
        // %s String
        System.out.printf("%s tem %d anos e pesa %.2fkg\n", fulano.nome, fulano.idade, fulano.peso);
        fulano.comer();
        fulano.respirar();
        fulano.dormir();

        Pessoa laura = new Pessoa();
        laura.nome = "Laura Bassani dos Anjos";
        laura.idade = 22;
        laura.peso = 70;
        System.out.printf("\n%s tem %d anos e pesa %.2fkg\n", laura.nome, laura.idade, laura.peso);
        laura.comer();
        laura.respirar();
        laura.dormir();
    }
}

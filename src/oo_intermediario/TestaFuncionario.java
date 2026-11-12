package oo_intermediario;

import java.math.BigDecimal;

public class TestaFuncionario{
    public static void main(String[] args){
        Funcionario fulano = new Funcionario("Fulano da Silva", 500, new BigDecimal("1234.56")); //tem que criar um BigDecimal, o dado tem que ser passado como String

        // como adicionar valor a uma variavel BigDecimal, tem que utilizar métodos para realizar contas ex: add, divide
        BigDecimal salarioAntigo = fulano.getSalario();
        BigDecimal novoSalario = salarioAntigo.add(new BigDecimal("1000"));
        fulano.setSalario(novoSalario);

        fulano.setIdade(3);

        System.out.println("Idade: " + fulano.getIdade());
        System.out.println("Novo salário: " + fulano.getSalario());
    }
}


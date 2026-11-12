package oo_intermediario;

import java.math.BigDecimal;

public class Funcionario {
    final int IDADE_MINIMA = 18; //constante; é uma variável que não pode ser mudada, só pode ser atribuida uma vez
    final int IDADE_MAXIMA = 70;

    private String nome;
    private int idade;
    private BigDecimal salario; //BigDecimal evita arredondamentos

    public Funcionario(String nome, int idade, BigDecimal salario){
        this.nome = nome;
        this.setIdade(idade); // vai puxar a idade do set
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public BigDecimal getSalario(){
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade >= IDADE_MINIMA && idade <= IDADE_MAXIMA){
            this.idade = idade;
        } else {
            this.idade = IDADE_MINIMA; // pra ele não escrever 0 na idade na hora de executar o código
            System.out.println("Idade inválida!");
        }
    }
    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }
}

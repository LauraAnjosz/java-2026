package calculadora;

import javax.swing.*;

public class TestaCalculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        calc.n1 = 40;
        calc.n2 = 2;

        System.out.println(calc.n1);
        System.out.println(calc.n2);

        System.out.println("Soma: "+calc.somar());
        System.out.println("Subtração: "+calc.subtrair());
        System.out.println("Produto: "+calc.multiplicar());
        System.out.println("Quociente: "+calc.dividir());

        System.out.println("Soma: "+calc.somar(50, 100));
        System.out.println("Subtração: "+calc.subtrair(100, 50));
        System.out.println("Produto: "+calc.multiplicar(50, 100));
        System.out.println("Quociente: "+calc.dividir(100, 50));
        calc.mostrarUltimoResultadoCalculado();

        JOptionPane.showMessageDialog(null,calc.mostrarUltimoResultadoCalculado());

    }
}

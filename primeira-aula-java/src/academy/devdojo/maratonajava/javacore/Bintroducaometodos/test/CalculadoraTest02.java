package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(2,3); //quando eu faço um método do tipo parametro, eu devo definir os valores deles na execução, é o conceito de parametpr
        System.out.println(calculadora);
    }
}

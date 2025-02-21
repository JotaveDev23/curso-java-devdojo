package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double valor = calculadora.divideDoisNumeros(10,0);
        //como meu return está retornando um double, eu preciso criar uma variavel desse tipo para receber o valor
        System.out.println(valor);
    }
}

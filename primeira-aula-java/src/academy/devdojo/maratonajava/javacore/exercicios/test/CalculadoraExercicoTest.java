package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.CalculadoraExercicio;

public class CalculadoraExercicoTest {
    public static void main(String[] args) {
    CalculadoraExercicio valorDobrado = new CalculadoraExercicio();
    int valor = valorDobrado.dobroDaConta(5);
        System.out.println(valor);
    }
}

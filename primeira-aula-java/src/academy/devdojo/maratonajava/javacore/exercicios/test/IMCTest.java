package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.PessoaImc;

public class IMCTest {
    public static void main(String[] args) {
        PessoaImc imcCalculo = new PessoaImc();
        String imcCalculado = imcCalculo.calcularIMC("João", 73, 1.70);
        System.out.println(imcCalculado);
    }
}

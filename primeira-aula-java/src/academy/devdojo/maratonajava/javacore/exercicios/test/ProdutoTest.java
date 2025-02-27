package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto();
        String produtoFinal = produto.calcularDesconto("Iphone 15", 7000, 35);
        System.out.println(produtoFinal);
    }
}

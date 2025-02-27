package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.Mercado;

public class MercadoTest {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();
        String precoMercado = mercado.mercado("Apple Vision ", 2500, 4);
        System.out.println(precoMercado);
        }
    }

package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.CarroEx;

public class Carro {
    public static void main(String[] args) {
        CarroEx modeloAno = new CarroEx();

        String mensagem = modeloAno.descricao("Palio", 2012);
        System.out.println(mensagem);
    }
}

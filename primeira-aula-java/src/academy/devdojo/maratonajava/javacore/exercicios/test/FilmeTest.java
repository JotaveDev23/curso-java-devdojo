package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.Filme;

public class FilmeTest {
    public static void main(String[] args) {
        Filme filme = new Filme();
        String filmeAno = filme.descricao("Jumanji: Bem Vindo a Selva ", "Jake Kasdan ", 2018, 962.544);
        System.out.println(filmeAno);
    }
}

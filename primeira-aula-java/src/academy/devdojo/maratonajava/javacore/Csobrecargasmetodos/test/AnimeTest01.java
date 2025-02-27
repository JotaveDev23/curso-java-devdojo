package academy.devdojo.maratonajava.javacore.Csobrecargasmetodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargasmetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto","TV",600);
        anime.setGenero("Ação");
        anime.imprime();
    }
}

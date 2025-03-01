package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece"); //vai reproduzir o construtor que está vazio

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
            
        }

    }
}

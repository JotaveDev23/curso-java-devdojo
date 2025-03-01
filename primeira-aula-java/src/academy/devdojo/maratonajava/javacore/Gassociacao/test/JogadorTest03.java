package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu"); //está sendo referenciado pela variavel jogador
        Jogador jogador2 = new Jogador("Pelé"); //está sendo referenciado pela variavel jogador2
        Time time = new Time("Seleção Brasileira"); //aqui eu tenho um time
        Jogador[] jogadores = {jogador, jogador2}; //criei um array que vai receber dois, dentro de cada, um faz ref a j e o outro a j2

        jogador.setTime(time); //aqui dentro eu tenho um variavel time, que está fazendo ref ao que time está fazendo q é "seleção brasileira"
        jogador2.setTime(time);

        time.setJogadores(jogadores); //time tem uma variavel jogadores, que está fazendo ref ao array jogadores

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}

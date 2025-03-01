package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        //quando eu faço isso, eu tenho dois objetos distintos, ou seja eles não tem relação ainda

        jogador1.setTime(time); //aqui estou setando qual o time do jogador1 e oq está nos parenteses é o valor que foi dado quando criei o objeto
        jogador1.imprime();
    }
}

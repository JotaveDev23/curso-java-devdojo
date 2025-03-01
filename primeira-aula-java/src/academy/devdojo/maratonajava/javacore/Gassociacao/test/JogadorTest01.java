package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador1 = new Jogador("Romário");
        Jogador jogador2 = new Jogador("Cafu");

        Jogador [] jogadores = {jogador, jogador1, jogador2}; //classe jogador do tipo array variavel de ref jogadores, que faz ref a array , array instanciando objetos

        for (Jogador jogador0 : jogadores) { //para variavel de ref a objeto jogador0 percorrer toda array jogadores
            jogador0.imprime(); //imprimir oq jogador0 obteve de info ao percorrer array

        }

    }
}

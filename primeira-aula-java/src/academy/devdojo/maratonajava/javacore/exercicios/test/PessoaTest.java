package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        // Chamando o método e armazenando o retorno
        String mensagem = p1.apresentar("João", 25);

        // Exibindo a mensagem retornada pelo método
        System.out.println(mensagem);
    }
}

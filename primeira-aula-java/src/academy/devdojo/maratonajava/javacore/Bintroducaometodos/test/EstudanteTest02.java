package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "João";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
        //como eu tenho o this dentro da minha classe imprime, ela sempre vai retornar os valores que estão no objeto
        //ou seja, quero que ela imprima esse nome, essa idade, esse sexo, para cada uma das coisas
        //que está dentro da variavel de objeto
    }
}

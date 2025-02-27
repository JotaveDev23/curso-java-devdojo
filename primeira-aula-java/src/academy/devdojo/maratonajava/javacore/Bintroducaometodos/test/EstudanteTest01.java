package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante imprimir = new ImprimeEstudante(); //ADICIONEI O MÉTODO QUE EU HAVIA CRIADO, PARA CONTER TODAS AS INFO. DO ESTUDANTE PARA QUE SEJA IMPRESSO

        estudante01.nome = "João";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        //AO INVÉS DE FAZER UM SOUT AQUI DENTRO EU POSSO FAZER ELE DENTRO DA CLASSE MESMO, REFERENCIANDO A ESTUDANTE

        imprimir.impressora(estudante01);
        imprimir.impressora(estudante02);

        /*Primeiro que, nesse video, tem 3 classes, onde 1 delas é a "pai" e as outras são subsidiárias delas.

        A classe pai é a Estudante, elas tem 2 filhas/subsidiárias, que é a Impressora e a EstudanteTeste.

        A Classe pai só tem as informações básicas, que seria a String, char e int, mas nenhum dado real,
        a teste ela meio que cria um banco de dados para a Pai usar(nesse caso foram 2: Estudante01 e Estudante02),
         mas, para poupar código e não repetir tudo direto com println, foi feito uma nova subsidiária, que foi a Impressora.

         O que ocorre aqui é o seguinte, as duas estão referenciando apenas a classe pai(Estudante), por isso que a impressora
         tá  com o código apenas Estudante(sem o 01 e 02), mas a impressora não tem nenhum banco de dados reais, então a classe
         teste ela envia primeiro o banco de dados 01, a impressora puxa esses dados e junta com as informações do objeto pai
         e imprime para gente, depois disso a impressora meio que libera esse espaço,  então o teste manda o banco de dados 02
         e a impressora faz o mesmo e imprime para a gente, por isso que é irrelevante
         na impressora ter o 01 e 02, porque ela está usando de referência apenas o original, o teste que fornece esses dados temporários para ela juntar ao Pai.
         */


    }
}

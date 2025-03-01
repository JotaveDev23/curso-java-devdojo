package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor1 = new Professor("Kakashi");
        Professor [] professores = {professor, professor1}; //dessa forma deixa o código mais limpo, porem poderia fazer diretamente na debaixo
        Escola escola = new Escola("Konoha", professores); //poderia instanciar a array aqui dentro por conta do construtot que foi criado dentro da classe
        // aqui dentro da array ela está recebendo toda array professores, então se eu tivesse mais prof, imprimiria todos

        escola.imprime();
    }
}

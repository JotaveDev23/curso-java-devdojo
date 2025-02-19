package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); //para criar objetos sempre preciso da palavra new
        //(variavel de referencia do tipo estudante // objeto do tipo estudante)
        estudante.nome = "João";
        estudante.idade = 20;
        estudante.sexo ='M';

        System.out.println(estudante.nome); //para que eu consiga apresentar não basta colocar nome da variavel de referencia
        // pois vai mostrar o endereço, então devo fazer isso para todas as classes, que quero apresentar
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        //a classe é um agrupamento de coisas do mundo real que irão dar origem a um objeto
        //uma classe que contem, nome, cpf, idade --> pode estar dando origem a um objeto pessoa
        //e eu devo importar a classe para dentro do meu .java

    }

}

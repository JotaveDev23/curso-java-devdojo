package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); //caso eu nn defina uma variavel de referencia não consigo acessar o espaço de memória
        Estudante estudante2 = new Estudante();

        estudante.nome = "Sanji";
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);

        System.out.println("------------");

        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
    }
}

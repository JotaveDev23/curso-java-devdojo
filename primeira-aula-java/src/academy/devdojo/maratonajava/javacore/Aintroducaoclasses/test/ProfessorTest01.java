package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jose";
        professor.idade = 27;
        professor.sexo ='M';

        System.out.println(professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo); //uso contatenação para dar espaço

    }
}

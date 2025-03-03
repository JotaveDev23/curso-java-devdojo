package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professores;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminarios;

public class SeminariosTest01 {
    public static void main(String[] args) {
        Seminarios seminarios = new Seminarios("Seminario 1", "Escola de Konoha");
        Aluno aluno = new Aluno("João Vitor", 20);
        Aluno aluno2 = new Aluno("Marcelo Gomes", 18);
        Professores professores = new Professores("Caio", "Matemática");
        Aluno[] alunos = {aluno, aluno2};

        Seminarios seminarios2 = new Seminarios("\nSeminario 2", "Escola de Castor");
        Aluno aluno01 = new Aluno("Vitor Maciel", 20);
        Aluno aluno02 = new Aluno("Joaninha", 18);
        Professores [] professores1 = {professores};
        Aluno[] alunos2 = {aluno01, aluno2};

        Seminarios seminarios3 = new Seminarios("\nGanhar seleção japão", "Blue Lock");
        Aluno aluno11 = new Aluno("Isagi", 17);
        Aluno aluno22 = new Aluno("Nagi", 18);
        Professores professores2 = new Professores("Ego", "Fundador Blue Lock");
        Aluno[] alunos3 = {aluno11, aluno22};

        seminarios.setAluno(alunos);
        seminarios2.setAluno(alunos2);
        seminarios3.setAluno(alunos3);
        seminarios2.setProfessores(professores1);

        seminarios.imprime();
        professores.imprime();
        seminarios2.imprime();
        seminarios3.imprime();
        professores2.imprime();
    }

}
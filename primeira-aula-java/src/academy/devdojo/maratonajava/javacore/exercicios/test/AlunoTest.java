package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 20;
        aluno.notasAluno = new double[]{8.5, 7, 9};

        aluno.exibirDados();
        aluno.mediaNotas();
    }
}

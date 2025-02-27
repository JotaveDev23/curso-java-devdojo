package academy.devdojo.maratonajava.javacore.exercicios.dominio;

public class Aluno {
    public String nome;
    public int idade;
    public double[] notasAluno;

    public void exibirDados() {
        System.out.println("Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);

        for (double notas : notasAluno) { //devo colocar qual o tipo que está percorrendo
            System.out.println("Nota: " + notas + " ");
        }
    }
    public void mediaNotas(){
        double media = 0;
        for (double notas : notasAluno){
            media += notas;
        }
        media /= notasAluno.length;
        System.out.println("A média do aluno foi: " +media);

    }
}
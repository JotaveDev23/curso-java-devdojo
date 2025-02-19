package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionaisExercicio {
    public static void main(String[] args) {

        double [][] notasAlunos = new double[3][4]; //aqui é uma matriz de 30 alunos e 4 notas

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 10;
        notasAlunos[0][2] = 10;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 10;
        notasAlunos[1][1] = 10;
        notasAlunos[1][2] = 10;
        notasAlunos[1][3] = 10;

        notasAlunos[2][0] = 10;
        notasAlunos[2][1] = 10;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 10;

        System.out.println("Calculando nota de cada aluno ");
        double soma; //declarando uma variável soma
        for (int i = 0; i <notasAlunos.length ; i++) {

            soma = 0; //soma começando de 0
            for (int j = 0; j < notasAlunos[i].length; j++) { //aqui o [j] vai pegar cada aluno i e atribuir a nota para cada um deles
                soma += notasAlunos [i][j]; //aqui está dizendo que a nota do aluno i é a soma de j 0,1,2,3
                
            }
            System.out.println("Média do aluno " +i+ " é = "+ (soma/4));
            // o i representa o primeiro valor, ou seja 3 alunos, já o j está representando o segundo valor que seria as notas
            // no sout está mostrando a média do aluno i, ou seja vai começar do primeiro aluno, fazer a soma de todas as notas [j] dele
            // e calcular a média, e depois muda para o segundo aluno e faz o mesmo processo, até finalizar

        }



    }
}

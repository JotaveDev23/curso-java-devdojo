package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
     Funcionario funcionario = new Funcionario();
     funcionario.nome = "Sanji";
     funcionario.idade = 24;
     funcionario.salarios = new double[]{1200, 987.32, 2000}; //defini os valores de salário aqui dentro da test já

     funcionario.imprime();
     funcionario.imprimeMediaSalarial();

    }
}

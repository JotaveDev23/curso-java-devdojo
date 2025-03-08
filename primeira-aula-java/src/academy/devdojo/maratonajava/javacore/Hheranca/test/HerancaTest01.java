package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01234-213");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Midoriya");
        pessoa.setCpf("23242434432");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("\n");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("432433254");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200000);

        funcionario.imprime();
    }
}

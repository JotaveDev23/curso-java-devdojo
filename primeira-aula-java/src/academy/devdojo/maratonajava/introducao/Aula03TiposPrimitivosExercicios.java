package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "João Vitor";
        String endereco = "Vila Guiomar, Rua Guarapari 790";
        double salario = 2500.0;
        String data = "14 / 02 / 2024"; //errei colocando a data como double sendo que não há possibilidade
        String relatorio = "Eu," + nome + " morando no endereço " + endereco +", confirmo que recebi o salario de " +salario+ ", na data "+data;
        System.out.println("Eu," + nome + " morando no endereço " + endereco +", confirmo que recebi o salario de " +salario+ ", na data "+data);

        //CORREÇÃO

        //posso criar uma string e depois adicionar no println o nome que escolhi para ela
        //para fazer um debug escolho a linha que quero e dps dou shift + f9 para abrir o debbuger, em seguida posso pressionar f8 para mostrar cada variavel do codigo e o resultado



    }

}

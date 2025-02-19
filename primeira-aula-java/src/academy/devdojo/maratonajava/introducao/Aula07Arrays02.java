package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double = 0 (vão apresentar valor 0 quando nn tiver definido nenhum valor)
        //char '\u0000' = '    ' (vai apresentar um valor em branco)
        //booolean = false (vai apresentar sempre false)
        //String = null

        String[] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "José";

        //para imprimir os 3 valores eu posso utilizar um for

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);//estou imprimindo array nomes na posição i
            //todas as vezes que eu quiser alterar um valor, devo alterar todos, senão irá dar erro
            //tipos reference tem mais opções
            //length diz o tamanho do array, ou seja o nomes.length está retornando o valor guardado no array, para que não precise ficar modificando tudo o codigo

        }
        nomes = new String[5]; //o array passado é apagado e assume esse valor
    }
}

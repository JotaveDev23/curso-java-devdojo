package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [] array = {1, 2 , 3, 4 ,5 ,6};
        int [][] arrayBase = new int [3][]; //eu posso definir as colunas em outro array
        //aqui estou definindo quantas linhas meu array vai ter, e as colunas deixo em aberto

        arrayBase[0] = new int [2];
        arrayBase[1] = new int [] {1,2,3 }; //nessa parte eu atribuo quantas colunas ou quero ou o valor diretamente
        arrayBase[2] = array;

        int[][] arrayInt = {{0, 0},{1, 2 , 3},{1, 2 , 3, 4 ,5 ,6}}; //aqui estou fazendo um array multidimensional com as linhas q estão no arrayBase e
        //colocando os valores diretamente dentro delas apontando quantas colunas vão ter e qual será os seus valores

        for (int[] arrayMostra : arrayBase) {
            System.out.println("\n -----------");
            for (int arrayTudo : arrayMostra) {
                System.out.print(arrayTudo + " ");

            }

        }
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //arrays multidimensionais são arrays de arrays
        // array onde tenho 1,2 ,3 ,4 ,5 (meses)
        // array onde tenho 31, 28, 31, 30 (dias)

        int[][] dias = new int[3][3]; // aqui esta dizendo que tenho 3 arrays para 3 posições
        //tipo [0][0]/[0][1] ou [1][0]/[1][1] ou [2][0]/[2][1]
        dias [0][0] = 31; //o mês de janeiro recebe 31 dias
        dias [0][1] = 28;
        dias [0][2] = 31;

        dias [1][0] = 31;
        dias [1][1] = 28;
        dias [1][2] = 31;

        dias [2][0] = 31;
        dias [2][1] = 28;
        dias [2][2] = 31;


        for (int i = 0; i < dias.length ; i++) { //para o laço de i saindo do zero até i menor que tamanho array
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]); //quero que imprima o que tem dentro de cada linha do i e j
                //ou seja o i está representando a primeira coluna e o j a segunda coluna e ambos juntos dão um certo valor

            }

        }


    }
}

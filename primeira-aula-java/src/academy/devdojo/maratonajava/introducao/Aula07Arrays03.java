package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //FORMAS QUE EU POSSO FAZER UM ARRAY
        int [] numeros = new int [5];
        String [] numeros02 = {"João", "Maria"};
        int [] numeros03 = new int [] {1,2,3,4,5};
        int [] numeros04 = {1,2,3,4,5};

        for (int i = 0; i < numeros02.length; i++) { //para i saindo de 0 até i menor que tamanho do array, incremente mais um
            System.out.println(numeros02[i]); //imprima numeros02 no valor de i
        }
        for (String num : numeros02){ //para num percorrer td array numeros02
            System.out.println(num); //ela vai fazer referencia para cada uma das posições, então o tipo que eu usar na array tem que ser o mesmo dentro do foreach

        }

    }
}

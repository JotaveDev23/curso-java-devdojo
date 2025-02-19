package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição02 {
    public static void main(String[] args) {
        //imprima todos os números pares de 0 até 100000
        for (int i = 0; i <= 1000000; i += 2) {
            System.out.println(i);

        }
        int count = 0;
        while (count <= 1000000) {
            System.out.println("While" + count);
            count = count + 2;
        }
        for (int j = 0; j <= 1000000; j++) {
            if (j % 2 == 0){ //o resto de i dividido por 2 for igual a 0, significa que é par
                System.out.println("for if " +j );
            }

        }
    }
}

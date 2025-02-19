package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição03 {
    public static void main(String[] args) {
        int valorMax = 0;
        while (valorMax <= 50) {
            valorMax = valorMax + 1;
            if (valorMax > 25) {
                break;
            }
            System.out.println(valorMax);
        }
        int valorNumero = 50;
        for (int i = 0; i <= valorNumero ; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);

            //break é uma forma de parar um laço de repetição, sempre deve ser usado dentro de um, quando se quer alcançar um determinado
            //valor que está sendo pedido

        }
    }
}

package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.Restaurante;

public class RestauranteTest {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        String restaurantePratos = restaurante.valoreRestaurante("Lasanha", 45.90, 3);
        System.out.println(restaurantePratos);
    }
}


package academy.devdojo.maratonajava.javacore.exercicios.dominio;

public class Restaurante {
    public String valoreRestaurante (String nomePrato, double precoPrato, int quantidade){
        double valorPedido = precoPrato * quantidade;
            return "Você pediu " + quantidade + " unidades de " +nomePrato+ ". Cada unidade custa " +precoPrato+ ". Total a pagar: " +valorPedido;
    }
}

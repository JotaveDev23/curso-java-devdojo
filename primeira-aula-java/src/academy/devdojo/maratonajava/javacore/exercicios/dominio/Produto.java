package academy.devdojo.maratonajava.javacore.exercicios.dominio;

public class Produto {
    public String calcularDesconto (String nomeProduto, double precoProduto, int descontoProduto){
        double valorDescontado = descontoProduto * precoProduto;
        double valorMedio = valorDescontado / 100;
        double valorFinal = precoProduto - valorMedio;
        return "O produto " +nomeProduto+ " custa " + precoProduto+ ". Com um desconto de " +descontoProduto+ "%, o preço final é de " +valorFinal;
    }
}

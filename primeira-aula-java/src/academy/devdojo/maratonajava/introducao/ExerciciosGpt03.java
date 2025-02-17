package academy.devdojo.maratonajava.introducao;

public class ExerciciosGpt03 {
    public static void main(String[] args) {
        /*Desafio 5: Desconto Progressivo
Uma loja oferece descontos progressivos conforme o valor da compra:

Até R$ 100 → Sem desconto
De R$ 101 a R$ 500 → 10% de desconto
Acima de R$ 500 → 20% de desconto
Peça ao usuário o valor da compra e exiba o preço final com o desconto aplicado. Use o operador ternário para calcular o desconto.
         */
        int valorCompra = 550;
        String semDesconto = "Sem desconto";
        String dezConto = "10% de desconto";
        String vinteConto = "20% de desconto";

        String resultado = valorCompra > 100 && valorCompra <= 500 ? dezConto : valorCompra > 500 ? vinteConto : semDesconto;
        System.out.println(resultado);

        //AREA DO RETANGULO
        int larguraRetangulo = 10;
        int alturaRetangulo = 5;

        int areaRetangulo = larguraRetangulo * alturaRetangulo;
        System.out.println("O valor de area do retangulo é de: " + areaRetangulo);

        double dobroArea = areaRetangulo * 2;
        System.out.println("O dobro da área é de: " + dobroArea);

        int valorFixo = 150;
        if (dobroArea > valorFixo){
            System.out.println("O dobro da área é maior");
        }else if (dobroArea < valorFixo){
            System.out.println("O dobro da área é menor");
        }else{
            System.out.println("O dobro da área é igual");
        }
    }
}

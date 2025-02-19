package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição05 {
    public static void main(String[] args) {
        //o continue continua fazendo os valores mesmo com a limitação
        double valorTotal = 30;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) { //comecei com uma parcela de 30 mil e quero que o laço continue até que a parcela
        double valorParcela = valorTotal / parcela; //seja maior ou igual a 1 então faço parcela menos parcela
            if(valorParcela < 10){ //se a parcela for menor que 10, ele vai continuar o código, acima de 10 ele não mostra
                continue; //não vai para a linha 13 enquanto essa parcela for menor do que 1000
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

            //o papel do continue nesse código é apenas imprimir parcelas que são maiores que o 10 e ignorar as parcelas pequenas
            //ou seja ele pula o que não está em restriçao, então tudo que for menor que 10, ele vai pular
        }

        int valorTotalcx = 50;

        for (int caixas = valorTotalcx; caixas >= 1; caixas--) {
            double valorPorCaixa = (double) valorTotalcx / caixas;

            if (valorPorCaixa < 5) {
                continue; // Pula para a próxima iteração se o valor for menor que 5
            }

            System.out.println("Caixas: " + caixas + " | Valor por caixa: R$ " + valorPorCaixa);
        }
    }
}


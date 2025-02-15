package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero01 + numero02);

        //se eu colocar uma string antes do resultado vai dar contatenação e apresentar o valor errado
        //para resolver o problema posso criar outra variável ou colocar a operação em parenteses
        //o resultado da divisão de dois numeros inteiros sempre vai ser inteiro

        // % (esse é o operador de resto)
        int resto = 22 % 1;
        System.out.println(resto);
        // pode ser usado para identificar se é par ou ímpar 0 par 1 ímpar

        // < > <= >= (maior, menor, maior igual, menor igual)
        // == (igual)
        // != (diferentes)
        // são operadores lógicos boolean, sempre vai voltar em true or false
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        // && (AND) || (or) !
        // exemplo usado: uma pessoa na holanda com mais de 30 anos ou = deve receber um salário maior que 4.612
        // ou = para estar dentro da lei e uma pessoa com menos de 30 anos deve receber um maior ou = a 3.381
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        // a boolean checa se os dados condizem com o que deve ser realizado para estar dentro da lei

        //simulação para porta ou variável or: vamos utilizar um exemplo no qual temos duas contas bancárias
        // e queremos comprar um ps5

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystation5Compravel =  valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        //código está checando com qual conta eu conseguiria comprar o playstation
        System.out.println("PS5 é comprável " + isPlaystation5Compravel);
    }
}
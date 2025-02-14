package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero01+numero02);

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
        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+ isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);
    }
}


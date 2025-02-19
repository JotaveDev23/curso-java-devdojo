package academy.devdojo.maratonajava.introducao;

public class ExerciciosGptLacosRepeticao {
    public static void main(String[] args) {
        //1) numeros pares de 2 a 20
        for (int i = 2; i <= 20 ; i+= 2) {
            System.out.println(i);
        }
        //2) multiplos de 5 e 50 (ordem descrescente) - usar while
        int numerosMultiplos = 50;
        while (numerosMultiplos > 0){
            System.out.println(numerosMultiplos);
            numerosMultiplos = numerosMultiplos - 5;
        }
        //3) calcule a soma dos números de 1 a 100 (usar for)
        int soma = 0; //entrada da soma = 0

        for (int j = 0; j <= 100 ; j++) { //para j começando do 0 até j ser menor igual a 100 incremento de um em um
            soma += j; // adiciona o valor de j a variavel soma
        }
        System.out.println(soma);

        //4) a soma dos números impares de 1 a 200
        int somao1 = 0;

        for (int k = 1; k <= 200 ; k+=2) { //somente números impares 1+2 igual a 3
            somao1 += k; // 0+3 = 3 ; 3+2 = 5
        }
        System.out.println(somao1);

        double valorViagem = 7500; //valor a ser pago pela viagem

        for (int parcela = 1; parcela <= valorViagem ; parcela++) { // para valor parcela começando do 1, até valor <= viagem, vou fazer parcela + parcela
            double valorParcela = valorViagem / parcela;  //para descobrir o valor da parcela, eu faço o valor da viagem dividido pela parcela
            if (valorParcela >= 500){ //cada parcela deve custar 500 reais ou mais, ou seja até a soma atingir 500, ela já vai estar somando mais doq apenas de 1 em 1
                System.out.println("Parcela "+parcela+" R$ " +valorParcela); //aqui estou imprimindo a quantidade de parcelas e o valor a ser pago em quantas vzs escolher
            }

        }
    }
}

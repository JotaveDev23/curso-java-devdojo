package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nO grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não ");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' '){ //estou chamando um charAt saindo da posição zero, que vai ser igual a um espaço ' '
            System.out.println("SIM"); //se a pergunta começar com espaço a resposta vai ser sim
        }else {
            System.out.println("NÃO");
        }
    }
}

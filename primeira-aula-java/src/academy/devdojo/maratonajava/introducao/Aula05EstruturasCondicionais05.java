package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //o switch é uma funçao do java que proprociona a utilização de uma forma mais organizada quando deve ser utilizar condicionais simples
        //para fazer uma escolha

        //Imprima o dia da semana, considerando 1 como domingo

        byte dia = 5;
        if(dia == 1){
            System.out.println("Domingo");
        }else if (dia == 2){
            System.out.println("Segunda");
        }
        //pode ser feito utilizando o switch
        byte diaSemana = 5;
        //pode ser usado int, char, byte, short, enum, String
        switch (diaSemana){
            case 1: //caso dia for 1
                System.out.println("Domingo");
                break;
            case 2: //caso dia for 2
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default: // o default é para uqando nem um dos casos for acionado ou executado
                // a posição onde ele fica não importa portanto que tenha um break
                System.out.println("Opçao inválida");
        } char sexo ='M';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção inválida");
                break;
                //sempre importante conter um break
        }

    }
}

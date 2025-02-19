package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição parcela >= 1000
    public static void main(String[] args) {
        double valorParcela = 3000;
        double valorCarro = 30000;

        for (int i = 0 ; i <= valorCarro ; i += valorParcela) {
            if(i > valorCarro){
                break;
            }
            System.out.println(i);

        }

        //CORREÇÃO YOUTUBE
        double valorTotal = 30000; //esse aqui seria o valor do carro

        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            //zero significa que não há parcela
            // <= valorTotal significa que eu quero contar de 1 até o valor total
            //e parcela++ para que ela seja acrescentada de um por um
            valorParcela = valorTotal / parcela;

            if(valorParcela >= 1000){
                System.out.println("Parcela "+parcela+" R$ "+valorParcela); //se o valor da parcela for maior ou igual a mil, ele deve imprimir isso
            }else {
                break;
            }
            
        }

        }




    }


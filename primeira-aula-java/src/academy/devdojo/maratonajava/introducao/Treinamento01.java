package academy.devdojo.maratonajava.introducao;
// seja bem vindo ao petshop <>, banho e tosa por um valor único de <>.

public class Treinamento01 {
    public static void main(String[] args) {
        String nomePetShop = "SEU DOG POR UM FIO";
        double valorBanhoTosa = 30;
        System.out.println("seja bem vindo ao petshop "+ nomePetShop + ", banho e tosa por um valor único de "+valorBanhoTosa+"R$");

        String nomeCachorro = "Téo";
        // dona wilma que é dona de téo tem um valor de 35 reais em sua conta, quantos ela vai ter de troco e vai conseguir pagar?
        int dinheiroWilma = (int) 35.0; //aqui estou forçando um int
        boolean wilmaPaga = valorBanhoTosa >= 30;
        System.out.println("ela consegue pagar? "+ wilmaPaga);

        //qual será o troco dela?
        System.out.println("O troco dela será de: " + (dinheiroWilma - valorBanhoTosa)+ "R$");


    }
}

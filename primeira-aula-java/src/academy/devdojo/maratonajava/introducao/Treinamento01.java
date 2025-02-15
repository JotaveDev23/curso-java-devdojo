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

        //exercicio tipos primitivos

        //Eu, <nome> estou escrevendo essa carta aberta para a empresa <empresa>, para anunciar que no tempo vago que estive
        // ai não recebi meu salário no valor de <salário>, então me dirigi ao rh para tentar negociar
        // desde então caiu um valor esquisito na minha conta no total de <esquisito>, então quero saber se foi uma redução do meu salário,
        // pois recebia um total de <salário> e agora caiu <esquisito>, desde já agradecido <carinhaFeliz>

        String nome = "João Vitor";
        String empresa = "Microsoft";
        double salario = 4500.0;
        double esquisitoValor = 3200.0;
        boolean reducao = salario >= esquisitoValor;
        char carinhaFeliz = '\u01a1';
        String mensagem = "Eu, " +nome+ " estou escrevendo essa carta para a empresa " +empresa+ ", para anunciar que no tempo vago que estive ";
        String mensagem02 ="ai não recebi meu salário no valor de " +salario+ ", então me dirigi ao rh para tentar negociar ";
        String mensagem03 = "desde então caiu um valor esquisito na minha conta de " +esquisitoValor+ ", então quero saber se foi uma redução do meu salário,";
        String mensagem04 = "pois recebia um total de " +salario+ " e agora caiu para" +esquisitoValor+ ", desde já agradecido" +carinhaFeliz;
        System.out.println(mensagem+mensagem02+mensagem03+mensagem04+reducao);




    }
}

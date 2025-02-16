package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;
        if (salario <= 34712) {
            double valor = 9.7 * salario / 100;
            System.out.println("O valor de taxa a ser pago é de: " + valor);
        }else if (salario >= 34713 && salario <= 68507){
            double valor1 = 34.35 * salario / 100;
            System.out.println("O valor de taxa a ser pago é de: " + valor1);
        }else{
            double valor2 = 49.5 * salario / 100;
            System.out.println("O valor de taxa a ser pago é de: " + valor2);
        }
        //CORREÇÃO ATRAVÉS DO CANAL YT
        double salarioAnual = 70000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.5 / 100;
        double valorImposto;
        if (salarioAnual <=  34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        }else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
            System.out.println(valorImposto);
        }
    }

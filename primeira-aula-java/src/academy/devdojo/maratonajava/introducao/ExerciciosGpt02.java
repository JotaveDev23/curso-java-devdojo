package academy.devdojo.maratonajava.introducao;

public class ExerciciosGpt02 {
    public static void main (String[] args) {
        /* 1)
        Peça a idade de uma pessoa e classifique-a da seguinte forma:
0 a 12 anos → Criança
13 a 17 anos → Adolescente
18 a 64 anos → Adulto
65 anos ou mais → Idoso
         */
        int idadePessoa = 52;
        String classificacao;

        if (idadePessoa <= 12) {
            classificacao = "Criança";
        }else if (idadePessoa == 13 || idadePessoa <= 17) {
            classificacao = "Adoslescente";
        }else if (idadePessoa == 18 || idadePessoa <=64){
            classificacao = "Adulto";
        }else {
            classificacao = "Idoso";
        }
        System.out.println(classificacao);

        /* Desafio 9: Calculadora de IMC
Peça ao usuário o peso (kg) e a altura (m). Calcule o Índice de Massa Corporal (IMC):
         */
        double peso = 84;
        double altura = 1.70;
        double altura2 = altura * altura;
        double imc = peso / altura2;
        String acimaAbaixo;

        if(imc < 18.5) {
            acimaAbaixo = "Abaixo do peso";
        }else if (imc == 18.5 || imc <= 24.9) {
            acimaAbaixo = "Peso normal";
        }else if (imc == 25 || imc <= 29.9){
            acimaAbaixo = "Sobrepeso";
        }else {
            acimaAbaixo = "Obesidade";
        }
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("O seu IMC é de: " + imc);
        System.out.println(acimaAbaixo);
    }
}

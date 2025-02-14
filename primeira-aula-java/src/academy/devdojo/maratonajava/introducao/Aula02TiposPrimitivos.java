package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        //int, double, float, char, byte, short, long, boolean
        //essas são as variáveis dos tipos primitivos
        int idade = 10;

        System.out.println(idade); //para imrpimir somente o que está dentro da variável

        System.out.println("A idade é"+ idade + "anos"); //imprimir mensagem e dentro da variável

        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFFloat = 2500;
        float salarioFloat = (float) 2500.0D; //aqui estou forçando um double dentro do float
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; //traduzindo unicode

        //long(8) e int(4) usado para números inteiros a diferença é tamanho
        //double(8) e float(4) usado para números decimais a diferença é o tamanho
        //byte(1) e short(2) são valores numéricos // //  //
        //char traduz unicode ou ascii


        String nome = "João";
        System.out.println(nome);

    }
}

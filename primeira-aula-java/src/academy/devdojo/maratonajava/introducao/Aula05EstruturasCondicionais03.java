package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        // exercicio para testar operador ternário

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não posso doar, mas um dia vou conseguir";

        // operador ternário pergunta a condição
        // (condição) ? verdadeito : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        //posso simplificar ainda mais fazendo (String resultado = salario > 5000 ? "Eu vou doar 500 para o DevDojo" : "Ainda não posso doar, mas um dia vou conseguir";)
        //e remover as demais strings

        System.out.println(resultado);

        //sempre que eu tiver um verdadeiro ou falso posso usar um operador ternario, sempre que tiver um if e else simples
    }
}

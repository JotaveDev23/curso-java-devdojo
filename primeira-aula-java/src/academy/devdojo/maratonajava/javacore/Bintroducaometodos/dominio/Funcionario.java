package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios; //váriavel salário é uma referencia pra um array

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double salario : salarios) { //salario percorre toda variável salários, os valores que foram atribuidos dentro da classe test
            System.out.print(salario + " "); //caso isso não seja feito, não vai imprimir os valores, apenas o espaço de memória
        } //essa parte do código está fazendo imprimir todos os valores atribuidos na array
     }

    //void é usado quando só quero imprimir, não preciso de um retorno

    public void imprimeMediaSalarial(){ //não preciso pedir parametro porque estou dentro do objeto
        double media = 0;// caso média não começasse do 0, iria dar erro no programa e não seria possivel executa-lo, porque está dentro do método local
        //e não se tem valores de inicialização
        for (double salario : salarios){
            media += salario; //média recebe ela mesma mais salário
        }
        media /= salarios.length; //média recebe ela mesma e divide pelo tamanho salários (tamanho arrays, como tenho 3 salarios, divide por 3)
        System.out.println("\nMédia salarial: " + media);
    }
}

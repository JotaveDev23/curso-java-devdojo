package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //array(variedade) = é uma variedade de coisas que podem conter dentro de uma variavel, dependendo do valor escolhido
        //somente tipos de referencia podem ser iniciados com null(nulo)
        //quando se usa um array se torna uma entidade do tipo reference
        // array é considerado um objeto, ou seja a variavel está fazendo referencia a um objeto

        int [] idades = new int[3]; //toda vez que se declara um array eu preciso mostrar quanto de espaço em memória estou alocando, nesse exemplo é 3
        //o indice sempre começa de zero ou seja como está alocado 3, será 0,1,2

        idades [0] = 21;
        idades [1] = 33;
        idades [2] = 18;
        //aqui estou mostrando os valores que estão atribuidos em cada array, para imprimir
        //não se pode acessar um valor inexistente

        System.out.println(idades [0]); //aqui eu devo mostrar qual array estou puxando para imprimir
    }
}

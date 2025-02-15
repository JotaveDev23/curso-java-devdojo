package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idadeAtleta = 17;
        if (idadeAtleta <= 15) {
            System.out.println("Atleta da categoria infantil");
        } else {
            System.out.println("Atleta de outra categoria");
        }
        if (idadeAtleta > 15 && idadeAtleta <= 18) {
            System.out.println("Atleta da categoria juvenil");
        } else {
            System.out.println("Atleta de outra categoria");
        }
        if (idadeAtleta > 18) {
            System.out.println("Atleta categoria adulta");
        }

        //RESOLUÇÃO

        int idade = 17;
        String categoria; //defino uma string para deixar o código mais limpo

        if (idade < 15) { //se idade for menor que 15
           categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) { //se não se idade for >= 15 and idade < 18
            categoria = "Categoria Juvenil";
        } else { //se não
            categoria "Categoria adulto";
        }
        System.out.println(categoria);
        /*caso eu remova o ultimo else devo adicionar um nome na string para que seja impresso algo
        se não caso valor for maior do que os outros q tem impressão, vai dar erro de compilação
         */
    }
}

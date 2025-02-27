package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println(this.nome); //esse nome
        System.out.println(this.idade); //esse idade
        System.out.println(this.sexo); //esse sexo

        //quando eu utilizar a variavel de referencia this, ela vai buscar oque está dentro do objeto
    }


}

package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString(){ //O toString pertence a classe object, e aqui eu estou sobrescrevendo o método q ele executa
        //fazendo com que não seja necessário um método imprime
        return "Anime:" + this.nome;
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}

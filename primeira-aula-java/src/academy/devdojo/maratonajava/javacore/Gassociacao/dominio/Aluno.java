package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminarios seminarios;

    public Aluno (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Seminarios getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios seminarios) {
        this.seminarios = seminarios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
}

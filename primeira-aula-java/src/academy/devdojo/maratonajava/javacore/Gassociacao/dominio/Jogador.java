package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        System.out.println(this.nome);
        if(time != null){ //estou checando se a variável time é diferente de nulo, se existe um objeto em memória
            System.out.println(time.getNome()); //para assim poder chamar o getnome
        }
    }
    public Jogador(String nome){
        this.nome = nome;
    }

    public void setTime(Time time){
        this.time = time;
    }
    public Time getTime(){
        return time;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

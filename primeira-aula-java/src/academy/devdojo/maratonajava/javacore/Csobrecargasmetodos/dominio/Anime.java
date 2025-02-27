package academy.devdojo.maratonajava.javacore.Csobrecargasmetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init (String nome, String tipo, int espisodios){ //COMO ESTOU INICIALIZANDO DENTRO DO OBJETO, NÃO PRECISO SETAR
        //PORQUE ELE CONHECE O QUE TEM DENTRO, CRIEI ISSO PARA ECONOMIZAR CÓDIGO NA EXECUÇÃO
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = espisodios;

    }
    public Anime(){

    }
    public void init (String nome, String tipo, int episodios, String genero){
        this.init(nome,tipo,episodios); //posso fazer isso para não ficar repetindo código
        this.genero = genero;
    }
    public void imprime(){
        System.out.println(getNome());
        System.out.println(getTipo());
        System.out.println(getEpisodios());
        System.out.println(getGenero());

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public int getEpisodios(){
        return this.episodios;

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}

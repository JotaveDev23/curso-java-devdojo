package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero){  //para criar um anime, eu preciso passar esses dados obrigatoriamente
        //construtor não deve ter retorno
        this.nome = nome;
        this.genero = genero;
        this.tipo = tipo;
        this.episodios = episodios;

    }
    public Anime (String nome, String tipo, int episodios, String genero, String estudio){ //aqui estou fazendo uma sobrecarga de construtores
        this(nome,tipo,episodios,genero); //não consigo utilizar esta sintaxe fora de construtor
        //se eu quiser chamar outro construtor sempre deve ser a primeira linha o this();
        this.estudio = estudio;
    }
    public Anime(){

    }

    public void init (String nome, String tipo, int espisodios){ //COMO ESTOU INICIALIZANDO DENTRO DO OBJETO, NÃO PRECISO SETAR
        //PORQUE ELE CONHECE O QUE TEM DENTRO, CRIEI ISSO PARA ECONOMIZAR CÓDIGO NA EXECUÇÃO
        this.nome = nome;
        this.tipo = tipo;

    }
    public void init (String nome, String tipo, int episodios, String genero){
        this.init(nome,tipo,episodios, genero); //posso fazer isso para não ficar repetindo código
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

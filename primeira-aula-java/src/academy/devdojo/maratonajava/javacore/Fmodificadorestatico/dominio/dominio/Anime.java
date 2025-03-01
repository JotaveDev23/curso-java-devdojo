package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.dominio;

public class Anime {
    private String nome;
    private static int [] episodios;
    //0 - Bloco de inicialização estático é executado quando JVM carregar a classe (ele sempre é executado primeiro que tudo) (é executado só uma vez)
    //1 - É alocado espaço em meória pro objeto
    //2 - Cada atributo de classe é criado e iniciados com valores default ou o que for passado
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado

    static { //o bloco de inicialização sempre é executado quando é criado uma instancia do objeto
        System.out.println("Dentro do bloco");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) { // quando se tem códigos semelhantes a esse é recomendado criar um bloco de inicialização
            episodios[i] = i + 1; //para não ter que ficar replicando o codigo para dentro de todos os objetos
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) { //para i saindo de zero, até o tamanho de episodios, incremente mais um
            episodios[i] = i+1; //episodios na posição i recebe i+1 (ou seja, vai somando até o 100)

        }
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");

        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}

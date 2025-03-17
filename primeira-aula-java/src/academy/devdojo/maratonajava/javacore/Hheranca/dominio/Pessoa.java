package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome; //o protected faz com que todas as subclasses que foram criadas a classe pessoa com extends, tenha acesso direto a todos os atributos
    //como se eles existissem dentro da classe
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("DENTRO DO BLOCO ESTÁTICO DE PESSOA");
    }

    {
        System.out.println("BLOCO DE INICIALIZAÇÃO DE PESSOA 1");
    }
    {
        System.out.println("BLOCO DE INICIALIZAÇÃO DE PESSOA 2");
    }

    public Pessoa(String nome){
        System.out.println("DENTRO DO CONSTRUTOR DE PESSOA");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public void setNome(String nome){
        this.nome = nome;
    } 
    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Endereco getEndereco(){
        return endereco;
    }
}

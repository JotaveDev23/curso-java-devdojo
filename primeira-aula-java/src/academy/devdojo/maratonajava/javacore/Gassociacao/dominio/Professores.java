package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminarios [] seminarios;

    public Professores(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professores(String nome, String especialidade, Seminarios [] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.print("Professor(a): " + this.nome);
        System.out.println(" - "+this.especialidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }
}

package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminarios {
    private String titulo;
    private String endereco;
    private Aluno[] aluno;
    private Professores [] professores;

    public Seminarios(String titulo, String endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }
    public Seminarios(String titulo, String endereco, Aluno [] alunos) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.aluno = alunos;
    }

    public void imprime(){
        System.out.print(this.titulo);
        System.out.println(" - " + this.endereco);
        if(aluno == null) return;
        for(Aluno alunos : aluno){
            System.out.print(alunos.getNome());
            System.out.println(" " + alunos.getIdade() + " Anos");
        }
        if(professores == null) return;
        for (Professores professor : professores) {
            System.out.print("Professor(a): " + professor.getNome());
            System.out.println(" - " + professor.getEspecialidade());

        }
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }

    public Professores[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professores[] professores) {
        this.professores = professores;
    }
}

package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Funcionario extends Pessoa {
    //0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    //1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
    //2 - É alocado espaço em mem+ória pro objeto da superclasse
    //3 - Cada atributo da superclasse é criado e iniciados com valores default ou o que for passado
    //4 - Bloco de inicialização da super classe é executado na ordem que aparece
    //5 - Construtor é executado na superclasse
    //6 - É alocado espaço em mem+ória pro objeto da subclasse
    //7 - Cada atributo da subclasse é criado e iniciados com valores default ou o que for passado
    //8 - Bloco de inicialização da sub classe é executado na ordem que aparece
    //9 - Construtor é executado na subclasse

    private double salario;

    static {
        System.out.println("DENTRO DO BLOCO ESTÁTICO DE FUNCIONÁRIO");
    }

    {
        System.out.println("BLOCO DE INICIALIZAÇÃO DE FUNCIONÁRIO 1");
    }
    {
        System.out.println("BLOCO DE INICIALIZAÇÃO DE FUNCIONÁRIO 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("DENTRO DO CONSTRUTOR DE FUNCIONÁRIO");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
}

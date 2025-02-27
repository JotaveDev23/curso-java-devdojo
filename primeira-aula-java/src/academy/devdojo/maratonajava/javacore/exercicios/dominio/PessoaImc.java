package academy.devdojo.maratonajava.javacore.exercicios.dominio;

public class PessoaImc {
    public String calcularIMC (String nomePessoa, double pesoPessoa, double alturaPessoa){
        double IMC = pesoPessoa / (alturaPessoa * alturaPessoa);
        return nomePessoa+ " tem " + pesoPessoa+ " e " + alturaPessoa + ". Seu IMC é " + IMC;
    }
}

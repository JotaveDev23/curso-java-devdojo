package academy.devdojo.maratonajava.introducao;

public class ExerciciosGpt01 {
    public static void main(String[] args) {
        //1) saudação baseada no horario

        int horarioDoDia = 24;
        String saudacao;
        if (horarioDoDia == 0 || horarioDoDia <= 11) {
            saudacao = "bom dia!!";
        } else if (horarioDoDia == 12 || horarioDoDia <= 17) {
            saudacao = "boa tarde!!";
        } else {
            saudacao = "boa noite!!";
        }
        System.out.println(saudacao);
        //2) verificar maior idade

        int idadeUsuario = 17;
        if (idadeUsuario < 18){
            System.out.println("Menor de idade (desaprovado)");
        }else if (idadeUsuario >= 18){
            System.out.println("Maior de idade (aprovado)");
        }
        //3) cálculo de dobro ou triplo
        int numeroSelecionado = 56;
        System.out.println("Dobro: " +numeroSelecionado * 2);
        System.out.println("Triplo: " +numeroSelecionado * 3);

        //4) soma de dois números
        int numero01 = 45;
        int numero02 = 33;
        System.out.println(numero01 + numero02);

        //5) porcentagem
        int valorOriginal = 100;
        int descontoValor = 10;
        System.out.println("Preço original: " + valorOriginal);
        System.out.println("Desconto: "+descontoValor);
        int precoFinal = descontoValor * valorOriginal / 100;
        System.out.println("Preço final: " + (valorOriginal - precoFinal));
        }
    }



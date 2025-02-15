package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // IF (se), obrigatoriamente o que se tem dentro do parenteses do if tem que ser booleano
        // if sempre seve estar dentro de chaves tambem

        if(true){
            System.out.println("dentro do if");
        }
        //criando sistema para compra de bebida alcoolica
        int idade = 18;
        boolean isAutorizado = idade >= 18;
        if(isAutorizado){
            System.out.println("Pessoa autorizada");
        }else{
            System.out.println("Não autorizado");
        }
      if(!isAutorizado){ // if(isAutorizado == false) está fazendo a mesma coisa porém usando sinal de negação então "se não"
          System.out.println("Não autorizado");
      }
      //não preciso criar uma booleana nova ou repetir o código, posso adicionar um sinal de negação ! para true or false e ficaria
        // if(!blabla) como está acima no sistema ou seja (se não)

        //não se pode ter um else sem um if
    }
}

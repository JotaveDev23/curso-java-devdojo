package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() { //nesse aqui os valores já estão definidos dentro dele
        System.out.println(10 + 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) { //aqui significa q eu tenho dois parametros do tipo inteiro, ou seja, eu preciso de dois valores aqui
        //do tipo inteiro, para realizar o sout e ele funcionar
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if(num2 == 0){
            return 0;
        } else if (num1 == 0) {
            return 0;

        }
        return num1/num2; //devo colocar qual o valor eu quero que seja retornado
    }
}

package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

//crie uma classe carro com os seguintes atributos

//NOME
//MODELO
//ANO

//em seguida, crie dois objetos distintos e imprima valores

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Toyota Corolla";
        carro01.modelo = "XEi 2.0";
        carro01.ano = 2020;

        carro02.nome = "Honda Civic";
        carro02.modelo = "Touring 1.5 Turbo";
        carro02.ano = 2018;

        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("\nCarro: " + carro02.nome + " " + carro02.modelo + " "+carro02.ano);

    }
}

package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.AnimalEX;

public class Animal {
    public static void main(String[] args) {
        AnimalEX descrever = new AnimalEX();
        String descricaoAnimal = descrever.animalEscolhido("Leoncio", "Tigre", 8);
        System.out.println(descricaoAnimal);
    }
}

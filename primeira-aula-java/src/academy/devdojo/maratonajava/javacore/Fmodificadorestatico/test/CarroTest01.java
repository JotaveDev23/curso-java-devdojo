package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", 280);
        Carro carro1 = new Carro("Mercedes", 275);
        Carro carro2 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(180 ); //todas as instancias da classe carro, vão ter um valor padrão de 180 de vel limite

        carro.imprime();
        carro1.imprime();
        carro2.imprime();
    }
}

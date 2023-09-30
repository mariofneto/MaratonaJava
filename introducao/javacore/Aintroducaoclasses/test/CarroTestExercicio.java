package maratonajava.introducao.javacore.Aintroducaoclasses.test;

import maratonajava.introducao.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTestExercicio {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Corola";
        carro1.modelo = "Sedan";
        carro1.ano = 2017;

        Carro carro2 = new Carro();
        carro2.nome = "Fusca";
        carro2.modelo = "Popular";
        carro2.ano = 1985;

        System.out.println("Carro1{ \nNome: "+ carro1.nome +"\nModelo: "+ carro1.modelo+"\nAno: "+ carro1.ano+"\n}");
        System.out.println("Carro2{ \nNome: "+ carro2.nome +"\nModelo: "+ carro2.modelo+"\nAno: "+ carro2.ano+"\n}");
    }
}

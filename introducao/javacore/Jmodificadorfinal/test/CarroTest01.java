package maratonajava.introducao.javacore.Jmodificadorfinal.test;

import maratonajava.introducao.javacore.Jmodificadorfinal.dominio.Carro;
import maratonajava.introducao.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Marin");
        System.out.println(carro.COMPRADOR);
    }
}

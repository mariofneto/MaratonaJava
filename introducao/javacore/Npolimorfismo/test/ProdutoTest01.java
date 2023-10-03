package maratonajava.introducao.javacore.Npolimorfismo.test;

import maratonajava.introducao.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.introducao.javacore.Npolimorfismo.dominio.Tomate;
import maratonajava.introducao.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("PC DA XUXA", 250);
        Tomate tomate = new Tomate("Tomate cereja", 5);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("---------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}

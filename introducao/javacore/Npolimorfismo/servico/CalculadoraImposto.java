package maratonajava.introducao.javacore.Npolimorfismo.servico;

import maratonajava.introducao.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.introducao.javacore.Npolimorfismo.dominio.Produto;
import maratonajava.introducao.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if(produto instanceof Tomate tomate){
            System.out.println("Validade: "+ tomate.dataValidade);
        }
    }
}

package maratonajava.introducao.javacore.Npolimorfismo.test;

import maratonajava.introducao.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.introducao.javacore.Npolimorfismo.dominio.Produto;
import maratonajava.introducao.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("PC DA XUXA 2021", 25300);
        Produto produto2 = new Tomate("TOMATTE CEREJA", 20);

        System.out.println(produto1);
        System.out.println(produto2);
    }
}

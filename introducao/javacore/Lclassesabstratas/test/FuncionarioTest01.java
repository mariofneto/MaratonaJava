package maratonajava.introducao.javacore.Lclassesabstratas.test;

import maratonajava.introducao.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import maratonajava.introducao.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Usopp", 22000.00);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}

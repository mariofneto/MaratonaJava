package maratonajava.introducao.javacore.Bintroducaometodos.test;

import maratonajava.introducao.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = new int[]{1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,36,1);
    }
}

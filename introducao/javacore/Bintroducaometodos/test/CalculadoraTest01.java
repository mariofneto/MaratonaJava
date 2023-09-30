package maratonajava.introducao.javacore.Bintroducaometodos.test;

import maratonajava.introducao.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("---Soma---");
        calculadora.somaDoisNumeros();
        System.out.println("---Subtrai---");
        calculadora.subtraiDoisNumeros();
        System.out.println("---Multiplica---");
        calculadora.multiplicaDoisNumeros(10, 5);
        System.out.println("---Divide---");
        double divisao = calculadora.divideDoisNumeros(50, 0);
        System.out.println(divisao);
    }
}

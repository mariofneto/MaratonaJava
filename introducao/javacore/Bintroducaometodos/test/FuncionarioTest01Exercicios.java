package maratonajava.introducao.javacore.Bintroducaometodos.test;

import maratonajava.introducao.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01Exercicios {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Mário");
        funcionario.setIdade(21);
        funcionario.setSalario(new double[]{1250.00, 1350.00, 1450.00});

        funcionario.imprime();
        funcionario.mediaSalarios();

    }
}

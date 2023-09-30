package maratonajava.introducao.javacore.Hheranca.test;

import maratonajava.introducao.javacore.Hheranca.dominio.Endereco;
import maratonajava.introducao.javacore.Hheranca.dominio.Funcionario;
import maratonajava.introducao.javacore.Hheranca.dominio.Pessoa;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das laranjeiras");
        endereco.setCep("36774178");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jesus");
        pessoa.setCpf("77777777777");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Marin");
        funcionario.setCpf("15245655632");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3600);

        pessoa.imprime();
        System.out.println("------------");
        funcionario.imprime();
    }
}

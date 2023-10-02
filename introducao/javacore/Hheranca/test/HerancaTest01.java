package maratonajava.introducao.javacore.Hheranca.test;

import maratonajava.introducao.javacore.Hheranca.dominio.Endereco;
import maratonajava.introducao.javacore.Hheranca.dominio.Funcionario;
import maratonajava.introducao.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das laranjeiras", "36774178");
        Pessoa pessoa = new Pessoa("Jesus", "77777777777", endereco);
        Funcionario funcionario = new Funcionario("Marin", "15245655632", endereco, 3600.00);

        pessoa.imprime();
        System.out.println("------------");
        funcionario.imprime();
    }
}

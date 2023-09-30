package maratonajava.introducao.javacore.Aintroducaoclasses.test;
import maratonajava.introducao.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome =  "Mário";
        pessoa.idade = 21;
        pessoa.sexo = 'M';

        System.out.println("Nome: "+pessoa.nome + " Idade: " + pessoa.idade + " Sexo: " + pessoa.sexo);

    }
}

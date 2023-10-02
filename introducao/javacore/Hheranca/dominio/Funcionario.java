package maratonajava.introducao.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salario){
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário: R$"+ this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+ this.nome + ", recebi R$"+ this.salario+"!");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

package maratonajava.introducao.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario = new double[3];
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public void imprime(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Salario1: "+this.salario[0] +", Salario2: "+ this.salario[1] + ", Salario3: "+ this.salario[2]);
    }

    public void mediaSalarios(){
        for(double salario : this.salario){
            this.media +=salario;
        }

        double mediaSalarios = this.media /this.salario.length;
        System.out.println("--------------------------");
        System.out.println("A média dos salários é "+ mediaSalarios);

    }

}

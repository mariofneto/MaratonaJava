package maratonajava.introducao.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco static de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Cpf: "+ this.cpf);
        System.out.println("Endereco: "+ this.endereco.getRua() + " - "+ this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

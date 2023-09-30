package maratonajava.introducao.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private Escola escola;
    public Professor(String nome) {
        this.nome = nome;
    }
    public void imprime(){
        System.out.println(this.nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

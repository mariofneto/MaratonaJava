package maratonajava.introducao.javacore.Gassociacaoexercicio.dominio;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("--- ENDEREÇO ---");
        System.out.println(this.endereco);
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

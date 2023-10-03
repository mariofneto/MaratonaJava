package maratonajava.introducao.javacore.Kenumeracao.dominio;

public class Cliente {
    private String nome;
    private ETipoCliente tipoCliente;

    public Cliente(String nome, ETipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteValor=" + tipoCliente.VALOR +
                '}';
    }
}

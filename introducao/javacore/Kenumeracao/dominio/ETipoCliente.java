package maratonajava.introducao.javacore.Kenumeracao.dominio;

public enum ETipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALOR;
    ETipoCliente(int valor){
        this.VALOR = valor;
    }
}

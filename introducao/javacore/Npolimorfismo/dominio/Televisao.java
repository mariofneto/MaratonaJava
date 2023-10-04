package maratonajava.introducao.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.15;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto da televisao");
        return this.valor * IMPOSTO_POR_CENTO;

    }

    @Override
    public String toString() {
        return "Televisao{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}

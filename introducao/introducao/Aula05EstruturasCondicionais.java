package maratonajava.introducao.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        int maioridade = 18;

        if (idade >= maioridade) {
            System.out.println("Você pode comprar bebida alcoolica, idade é "+ idade);
        } else {
            System.out.println("Você não pode comprar bebida alcoolica, idade é "+ idade);
        }
    }
}

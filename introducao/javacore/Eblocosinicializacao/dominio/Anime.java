package maratonajava.introducao.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime() {
        for (int ep : this.episodios){
            System.out.print(ep+" ");
        }
    }
}

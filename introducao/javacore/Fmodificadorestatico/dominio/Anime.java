package maratonajava.introducao.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    static {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime() {
        for (int ep : Anime.episodios){
            System.out.print(ep+" ");
        }
        System.out.println();
    }
}

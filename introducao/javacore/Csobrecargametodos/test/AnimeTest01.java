package maratonajava.introducao.javacore.Csobrecargametodos.test;

import maratonajava.introducao.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12);
        anime.imprime();

    }
}

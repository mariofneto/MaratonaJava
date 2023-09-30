package maratonajava.introducao.javacore.Dconstrutores.test;

import maratonajava.introducao.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Akudama Drive", "TV", 12);
        anime1.imprime();
        Anime anime2 = new Anime("One Piece", "TV", 1250, "Comedia");
        anime2.imprime();

    }
}

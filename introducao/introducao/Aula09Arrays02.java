package maratonajava.introducao.introducao;

public class Aula09Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Kurapika";
        nomes[1] = "Gon";
        nomes[2] = "Saitama";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i].toUpperCase());
        }

    }
}

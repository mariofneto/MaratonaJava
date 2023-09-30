package maratonajava.introducao.introducao;

public class Aula08EstruturasDeRepeticao02Exercicio {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 a 1000000
        int limite = 1000000;

        for (int i = 0; i <= limite; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}

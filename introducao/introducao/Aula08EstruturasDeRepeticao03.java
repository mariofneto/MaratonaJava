package maratonajava.introducao.introducao;

public class Aula08EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor, por exemplo 50
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            System.out.println(i);
            if (i > 25) {
                break;
            }
        }
    }
}

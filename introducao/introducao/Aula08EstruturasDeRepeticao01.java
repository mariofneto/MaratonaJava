package maratonajava.introducao.introducao;

public class Aula08EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while
        int count = 0;

        while (count < 10) {
            System.out.println("while "+ count);
            count++;
        }

        // do-while
        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

        // for
        for (int i = 0; i < 10; i += 5) {
            System.out.println("For " + i);
        }

    }
}

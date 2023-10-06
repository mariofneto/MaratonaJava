package maratonajava.introducao.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Mário Neto";
        nome.concat(" - Marin Fofoca");
        System.out.println(nome);

        StringBuilder nome2 = new StringBuilder("Mário Neto");
        nome2.append(" - Marin Fofoca");
        System.out.println(nome2);
        System.out.println(nome2.reverse());
        System.out.println(nome2.replace(0, 3, "Cal"));

    }
}

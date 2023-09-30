package maratonajava.introducao.introducao;

public class Aula02TiposPrimitivos {
    // --> psvm <-- cria metodo main
    public static void main(String[] args) {
        // int, double, float, char, byte, long, short, boolean
        int idadeFutura = 22;
        double salario = 1250.0;
        float salarioFuturo = 2000.0F;
        char letraInicialNome = 'M';
        byte numeroDaSorte = 7;
        long numeroGrande = 152645856523L;
        short numeroCurto = 125;
        boolean hetero = true;
        String txt = "String não é um tipo primitivo, mas é muito usado por isso ta aqui!";

        System.out.println("Eu irei fazer "+ idadeFutura + " anos!");
        System.out.printf("Eu tenho %.2f de dinheiro na conta%n", salario);
        System.out.println(hetero);
        System.out.println(txt);

    }
}

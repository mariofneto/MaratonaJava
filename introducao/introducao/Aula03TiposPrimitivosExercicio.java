package maratonajava.introducao.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Mário Ferreira Da Silva Neto";
        String endereco = "Rua Jota Lacerda, 121 - Fundos";
        double salario = 2000.00;
        String dataRecebimentoSalario = "18/09/2023";
        String relatorio = "Eu "+ nome+ ", " +
                "morando no endereço "+endereco+
                ", confirmo que recebi o salário de "
                + salario+", na data "+ dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}

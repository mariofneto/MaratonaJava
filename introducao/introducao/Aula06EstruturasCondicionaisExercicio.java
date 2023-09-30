package maratonajava.introducao.introducao;

public class Aula06EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        /*
            --- imposto em netherland ---

            se salario > 0 && salario <= 34712 paga 9.70% de imposto
            se salario >= 34713 && salario <= 68507 paga 37.35% de imposto
            se salario >= 68508 paga 49.50%
         */

        double salarioAnual = 2000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnual > 0 && salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;

        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.printf("Valor do imposto pago = %.2f €%n", valorImposto);
    }
}

package maratonajava.introducao.introducao;

public class Aula07EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte diaDaSemana = 1;
        String resultado = "";

        switch (diaDaSemana) {
            case 1:
                resultado = "Domingo - Final de Semana";
                break;
            case 2:
                resultado = "Segunda - Dia Útil";
                break;
            case 3:
                resultado = "Terça - Dia Útil";
                break;
            case 4:
                resultado = "Quarta - Dia Útil";
                break;
            case 5:
                resultado = "Quinta - Dia Útil";
                break;
            case 6:
                resultado = "Sexta - Dia Útil";
                break;
            case 7:
                resultado = "Sábado - Final de Semana";
                break;
            default:
                resultado = "Dia inválido";
                break;
        }

        System.out.println(resultado);
    }
}

package maratonajava.introducao.introducao;

import java.util.Scanner;

public class Aula07EstruturasCondicionais {
    public static void main(String[] args) {
        // imprima o dia da semana baseado na entrada do usuario, considerando 1 como domingo

        Scanner sc = new Scanner(System.in);
        String diaDaSemanaTexto = "";
        int diaDaSemanaNumero;

        System.out.print("Digite um número do dia da semana: ");
        diaDaSemanaNumero = sc.nextInt();

        switch (diaDaSemanaNumero) {
            case 1:
                diaDaSemanaTexto = "Domingo";
                break;
            case 2:
                diaDaSemanaTexto = "Segunda-Feira";
                break;
            case 3:
                diaDaSemanaTexto = "Terça-Feira";
                break;
            case 4:
                diaDaSemanaTexto = "Quarta-Feira";
                break;
            case 5:
                diaDaSemanaTexto = "Quinta-Feira";
                break;
            case 6:
                diaDaSemanaTexto = "Sexta-Feira";
                break;
            case 7:
                diaDaSemanaTexto = "Sábado";
                break;
            default:
                diaDaSemanaTexto = "Número inválido, tente de 1 até 7";
        }

        System.out.println(diaDaSemanaTexto);

        char sexo = 'T';
        String resultado = "";

        switch (sexo) {
            case 'M':
                resultado = "Sexo Masculino";
                break;
            case 'F':
                resultado = "Sexo Feminino";
                break;
            default:
                resultado = "Sexo Inválido";
                break;
        }

        System.out.println(resultado);


    }
}

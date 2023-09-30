package maratonajava.introducao.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        int valorUm = 10;
        int valorDois = 20;
        boolean isValorUmMaior = valorUm > valorDois;
        boolean isValorUmMenor = valorUm < valorDois;

        System.out.println("isValorUmMaior "+isValorUmMaior);
        System.out.println("isValorUmMenor "+isValorUmMenor);

        int contador = 0;
        contador++; //execute e incremente
        contador--; //execute e decremente
        ++contador; //incremente e execute
        --contador; //decremente e execute
        System.out.println(contador);


    }
}

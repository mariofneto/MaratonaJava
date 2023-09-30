package maratonajava.introducao.introducao;

public class Aula08EstruturasDeRepeticao04Exercicio {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra de quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000

        int valorTotal = 50000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal/parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela "+ parcela+ " R$ "+ valorParcela);
            }
            else{
                break;
            }
        }
    }
}

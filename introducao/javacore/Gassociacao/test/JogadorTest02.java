package maratonajava.introducao.javacore.Gassociacao.test;

import maratonajava.introducao.javacore.Gassociacao.dominio.Jogador;
import maratonajava.introducao.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Calleri");
        Time time = new Time("São Paulo FC");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}

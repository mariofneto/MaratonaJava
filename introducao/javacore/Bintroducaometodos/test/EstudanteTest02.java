package maratonajava.introducao.javacore.Bintroducaometodos.test;

import maratonajava.introducao.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Mário";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Odila";
        estudante02.idade = 21;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}

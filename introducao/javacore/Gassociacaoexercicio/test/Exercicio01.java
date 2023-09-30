package maratonajava.introducao.javacore.Gassociacaoexercicio.test;

import maratonajava.introducao.javacore.Gassociacaoexercicio.dominio.Aluno;
import maratonajava.introducao.javacore.Gassociacaoexercicio.dominio.Local;
import maratonajava.introducao.javacore.Gassociacaoexercicio.dominio.Professor;
import maratonajava.introducao.javacore.Gassociacaoexercicio.dominio.Seminario;

public class Exercicio01 {
    public static void main(String[] args) {
        Local local1 = new Local("Rua das Coves, 666");
        Aluno aluno1 = new Aluno("Mário", 21);
        Seminario seminario1 = new Seminario("Java Orientado a Objetos");
        Professor professor1 = new Professor("Roberto", "Especialista JAVA");

        Local local2 = new Local("Rua das Alfaces, 777");
        Aluno aluno2 = new Aluno("Odila", 21);
        Seminario seminario2 = new Seminario("C# Orientado a Objetos");
        Professor professor2 = new Professor("Dagoberto", "MVP C#");

        aluno1.setSeminario(seminario1);
        Aluno[] alunos1 = {aluno1};
        seminario1.setAlunos(alunos1);
        seminario1.setLocal(local1);
        Seminario[] seminarios1 = {seminario1};
        professor1.setSeminarios(seminarios1);

        System.out.println("||| Relatório 1 |||");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getIdade());
        System.out.println(seminario1.getTitulo());
        System.out.println(seminario1.getLocal().getEndereco());
        System.out.println(professor1.getNome());
        System.out.println("-------------------------");

        aluno2.setSeminario(seminario2);
        Aluno[] alunos2 = {aluno2};
        seminario2.setAlunos(alunos2);
        seminario2.setLocal(local2);
        Seminario[] seminarios2 = {seminario2};
        professor2.setSeminarios(seminarios2);

        System.out.println("||| Relatório 2 |||");
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getIdade());
        System.out.println(seminario2.getTitulo());
        System.out.println(seminario2.getLocal().getEndereco());
        System.out.println(professor2.getNome());



    }
}

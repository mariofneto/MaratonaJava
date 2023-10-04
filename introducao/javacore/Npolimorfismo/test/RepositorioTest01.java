package maratonajava.introducao.javacore.Npolimorfismo.test;

import maratonajava.introducao.javacore.Npolimorfismo.repositorio.Repositorio;
import maratonajava.introducao.javacore.Npolimorfismo.servico.RepositorioArquivo;
import maratonajava.introducao.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import maratonajava.introducao.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}

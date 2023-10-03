package maratonajava.introducao.javacore.Minterfaces.test;

import maratonajava.introducao.javacore.Minterfaces.dominio.DataBaseLoader;
import maratonajava.introducao.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();
        System.out.println("----------");
        dataBaseLoader.remove();
        fileLoader.remove();
        dataBaseLoader.checkPermision();
    }
}

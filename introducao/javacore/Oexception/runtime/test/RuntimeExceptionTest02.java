package maratonajava.introducao.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divide(8, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado!");
    }

    private static int divide(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, Não se divide número por zero!");
        }
        return a / b;
    }
}

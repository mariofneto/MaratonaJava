package maratonajava.introducao.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();

    }

    private static String abreConexao() {
        try{
            System.out.println("Escrevendo em um arquivo");
            System.out.println("Buscando no banco de dados");
            System.out.println("finalizando o procedimento padrão");
            return "conexão aberta";
        }catch(Exception e){
            System.out.println("Dentro do bloco catch");
            e.printStackTrace();
        }finally {
            System.out.println("Dentro do bloco finally");
        }
        return null;
    }
}

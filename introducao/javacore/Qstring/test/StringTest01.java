package maratonajava.introducao.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String pirataOnePiece = "    Buggy   ";
        String numeros = "012345";
        System.out.println(pirataOnePiece.charAt(0));
        System.out.println(pirataOnePiece.charAt(1));
        System.out.println(pirataOnePiece.charAt(2));
        System.out.println(pirataOnePiece.charAt(3));
        System.out.println(pirataOnePiece.charAt(4));
        System.out.println(pirataOnePiece.length());
        System.out.println(pirataOnePiece.replace("B", "M"));
        System.out.println(pirataOnePiece.toUpperCase());
        System.out.println(pirataOnePiece.toLowerCase());
        System.out.println(numeros.substring(0,3));
        System.out.println(pirataOnePiece.trim());
    }
}

package maratonajava.introducao.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        // Tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        float floatP = 1;
        double doubleP = 1;
        int intP = 1;
        long longP = 1L;
        char charP = 'M';
        boolean booleanP = true;

        // Wrappers
        Byte byteW = 1;
        Short shortW = 1;
        Float floatW = 1f;
        Double doubleW = 1d;
        Integer intW = 1;
        Long longW = 1L;
        Character charW = 'M';
        Boolean booleanW = true;

        // consigo transformar um em outro e vice-versa
        int p = intW;
        Integer w = intP;

        // .parse o argumento sempre sera uma string

        int num1 = Integer.parseInt("55");
        System.out.println(num1);
        float num2 = Float.parseFloat("20.55f");
        System.out.println(num2);

        // funções Character

        System.out.println(Character.isAlphabetic('8'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));




    }
}

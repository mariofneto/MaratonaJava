package maratonajava.introducao.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) throws ParseException {
        String pattern = "'São Paulo' dd 'de' MMMM 'de' YYYY";
        String parse = "São Paulo 09 de outubro de 2001";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.parse(parse));
    }
}

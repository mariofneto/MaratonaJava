package maratonajava.introducao.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = Locale.ITALIAN;
        Locale localeChinese = Locale.CHINESE;
        Locale localeIndia = Locale.forLanguageTag("hi_IN");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeChinese);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);

        System.out.println("Itália "+ df1.format(calendar.getTime()));
        System.out.println("China "+ df2.format(calendar.getTime()));
        System.out.println("Índia "+ df3.format(calendar.getTime()));
    }
}

package maratonajava.introducao.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.println(isoLanguage);
        }
        for (String isoCountry : isoCountries) {
            System.out.println(isoCountry);
        }


    }
}

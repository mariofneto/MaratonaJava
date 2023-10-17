package maratonajava.introducao.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        //ChronoUnit muito prática para trabalhar com intervalo e pegar os valores para outro uso
        LocalDateTime aniversarioMario = LocalDateTime.of(2001, Month.OCTOBER,10,5,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversarioMario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversarioMario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversarioMario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversarioMario, now));
    }
}

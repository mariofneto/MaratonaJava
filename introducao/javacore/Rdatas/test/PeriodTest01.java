package maratonajava.introducao.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        //Period é para periodo em tempo em dias/meses/anos
        LocalDate nowDate = LocalDate.now();
        LocalDate nowDateAfterTwoYears = nowDate.plusYears(2).plusDays(7);

        Period p1 = Period.between(nowDate, nowDateAfterTwoYears);
        Period p2 = Period.ofYears(p1.getYears());
        Period p3 = Period.ofWeeks(58);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(nowDate.until(nowDate.plusDays(p3.getDays()), ChronoUnit.MONTHS));
    }
}

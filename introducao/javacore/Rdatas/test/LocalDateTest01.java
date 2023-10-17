package maratonajava.introducao.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate local = LocalDate.of(2001, Month.OCTOBER, 9);
        LocalDate agora = LocalDate.now();
        System.out.println(local);
        System.out.println(agora);
    }
}

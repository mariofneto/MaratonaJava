package maratonajava.introducao.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(13,5);
        LocalTime localTimeAgora = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTimeAgora);
    }
}

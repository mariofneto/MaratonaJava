package maratonajava.introducao.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
        //Duration é para duração em tempo em horas/minutos/segundos

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = now.plusYears(2);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        System.out.println(d1);
    }
}

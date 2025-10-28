package aprendizagem.dataEHora;

import java.time.LocalDate; // importação para ver a data atual
import java.time.LocalDateTime; // importação para ver o horario atual
import java.time.Instant; // importação para ver

public class Index {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-10-28");
        LocalDateTime d05 = LocalDateTime.parse("2025-10-28T01:30:25");
        Instant d06 = Instant.parse("2025-10-28T01:30:25Z");
        Instant d07 = Instant.parse("2025-10-28T01:30:25-03:00");

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
    }
}

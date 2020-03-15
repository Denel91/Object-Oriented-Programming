package Data_Structures;

import java.time.LocalDate;
import java.util.Set;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.Month;

/**
 * Questa classe gestisce le date e segue l'International Standard Organization (ISO) per quello che riguarda i
 * formati delle date e del tempo.
 */
public class JavaDate {
    public static void main(String[] args) {

        // Represent a date in ISO 8601 format (YYYY-MM-DD)
        System.out.println(LocalDate.now());

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        /*
        for (String zoneId: zoneIds) {
            System.out.println(zoneId);
        }*/

        ZoneId zoneId = ZoneId.of("Europe/London");
        System.out.println(LocalDate.now(zoneId));

        LocalDate local = LocalDate.parse("2020-03-15");
        System.out.println("LocalDate: " + local);

        LocalDate localDate = LocalDate.parse("20200315", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("Date formatter: " + localDate);

        LocalDate lc = LocalDate.of(2020, Month.MARCH, 15);
        System.out.println("lc: " + lc);
    }
}

package XSMAS;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Xsmax {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(new Locale("it", "IT"));
        Calendar calendar1 = new GregorianCalendar(new Locale("it", "IT"));
        Calendar calendar2 = new GregorianCalendar(new Locale("it", "IT"));

        Locale locale = new Locale("it", "IT");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        String rightNow = dateFormat.format(new Date());

        DateFormat dateFormat1 = DateFormat.getTimeInstance(DateFormat.MEDIUM, locale);
        String time = dateFormat1.format(new Date());

        int giorno = calendar.get(Calendar.DAY_OF_MONTH);
        int mese = calendar1.get(Calendar.MONTH) + 1;
        int anno = calendar2.get(Calendar.YEAR);

        int capodanno = 1;

        System.out.println("Oggi è " + rightNow);

        if (giorno == capodanno) {

            System.out.println("Buon Anno!");

        } else {

            System.out.println("Non è ancora Capodanno!");
            System.out.println("Siamo il: " + giorno + "/" + mese + "/" + anno);
            System.out.print("Sono le ore: " + time);
        }
    }
}
package Dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        System.out.println("------ Test Calendar ------");
        Calendar date1 = new GregorianCalendar(2016, Calendar.MAY, 19, 23, 59, 30);
        System.out.println("Format DD/MM/YYYY 19/05/2016 : " + new SimpleDateFormat("dd/MM/yyyy").format(date1.getTime()));

        Calendar today = new GregorianCalendar();
        System.out.println("Format DD/MM/YYYY hh:mm:ss Today : " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(today.getTime()));

        System.out.println("--- Languages ---");
        new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        // The day and month of today in chinese
        System.out.println("Today in chinese: " + new SimpleDateFormat("EEEE dd MMMM", Locale.CHINESE).format(today.getTime()));
        // In french
        System.out.println("Today in french: " + new SimpleDateFormat("EEEE dd MMMM", Locale.FRENCH).format(today.getTime()));
        // In german
        System.out.println("Today in german: " + new SimpleDateFormat("EEEE dd MMMM", Locale.GERMAN).format(today.getTime()));
        // In russian
        System.out.println("Today in russian: " + new SimpleDateFormat("EEEE dd MMMM", new Locale("ru", "RU")).format(today.getTime()));
        System.out.println("--- Languages ---");

        System.out.println("------ Test Calendar ------");
    }
}

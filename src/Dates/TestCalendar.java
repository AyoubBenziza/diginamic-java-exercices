package Dates;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        System.out.println("------ Test Calendar ------");
        Calendar date1 = new GregorianCalendar(2016, Calendar.MAY, 19, 23, 59, 30);
        System.out.println("Format DD/MM/YYYY : " + date1.get(Calendar.DAY_OF_MONTH) + "/" + (date1.get(Calendar.MONTH) + 1) + "/" + date1.get(Calendar.YEAR));

        Calendar today = new GregorianCalendar();
        System.out.println("Format DD/MM/YYYY hh:mm:ss : " + today.get(Calendar.DAY_OF_MONTH) + "/" + (today.get(Calendar.MONTH) + 1) + "/" + today.get(Calendar.YEAR) + " " + today.get(Calendar.HOUR_OF_DAY) + ":" + today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND));

        System.out.println("--- Languages ---");
        // The day and month of today in chinese
        System.out.println("Today in chinese: " + today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("zh", "CN")) + " " + today.get(Calendar.DAY_OF_MONTH) + " " + today.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("zh", "CN")));
        // In french
        System.out.println("Today in french: " + today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("fr", "FR")) + " " + today.get(Calendar.DAY_OF_MONTH) + " " + today.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("fr", "FR")));
        // In german
        System.out.println("Today in german: " + today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("de", "DE")) + " " + today.get(Calendar.DAY_OF_MONTH) + " " + today.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("de", "DE")));
        // In russian
        System.out.println("Today in russian: " + today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("ru", "RU")) + " " + today.get(Calendar.DAY_OF_MONTH) + " " + today.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("ru", "RU")));
        System.out.println("--- Languages ---");
        System.out.println("------ Test Calendar ------");
    }
}

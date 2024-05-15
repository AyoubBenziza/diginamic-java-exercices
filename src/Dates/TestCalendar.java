package Dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        System.out.println("------ Test Calendar ------");
        Calendar date1 = Calendar.getInstance();
        date1.set(2016, Calendar.MAY, 19, 23, 59, 30);
        System.out.println("Format DD/MM/YYYY 19/05/2016 : " + new SimpleDateFormat("dd/MM/yyyy").format(date1.getTime()));

        Calendar today = Calendar.getInstance();
        System.out.println("Format DD/MM/YYYY hh:mm:ss Today : " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(today.getTime()));

        System.out.println("--- Languages ---");
        SimpleDateFormat sdfEnglish = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.ENGLISH);
        SimpleDateFormat sdfFrench = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRENCH);
        SimpleDateFormat sdfGerman = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);
        SimpleDateFormat sdfChinese = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINESE);
        SimpleDateFormat sdfRussian = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru", "RU"));

        // English
        System.out.println("Today in english: " + sdfEnglish.format(today.getTime()));
        // Chinese
        System.out.println("Today in chinese: " + sdfChinese.format(today.getTime()));
        // French
        System.out.println("Today in french: " + sdfFrench.format(today.getTime()));
        // German
        System.out.println("Today in german: " + sdfGerman.format(today.getTime()));
        // Russian
        System.out.println("Today in russian: " + sdfRussian.format(today.getTime()));
        System.out.println("--- Languages ---");

        System.out.println("------ Test Calendar ------");
    }
}

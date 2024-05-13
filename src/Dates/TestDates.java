package Dates;

import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        System.out.println("------ Test Dates ------");

        System.out.println("--- Today ---");
        Date today = new Date();
        System.out.println("Format DD/MM/YYYY: " + today.getDate() + "/" + (today.getMonth() + 1) + "/" + (today.getYear() + 1900));
        System.out.println("--- Today ---");

        System.out.println("--- 19/5/2016 23:59:30 ---");
        Date date1 = new Date(2016, 5, 19, 23, 59, 30);
        System.out.println("Format DD/MM/YYYY:hh:mm:ss : " + date1.getDate() + "/" + (date1.getMonth() + 1) + "/" + (date1.getYear()) + " " + date1.getHours() + ":" + date1.getMinutes() + ":" + date1.getSeconds());
        System.out.println("--- 19/5/2016 23:59:30 ---");

        System.out.println("--- Time System ---");
        System.out.println("Format DD/MM/YYYY:hh:mm:ss : " + today.getDate() + "/" + (today.getMonth() + 1) + "/" + (today.getYear()) + " " + today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds());
        System.out.println("--- Time System ---");
        System.out.println("------ Test Dates ------");
    }
}

package Tests;

import Entities.Theater;

public class TestTheater {
    public static void main(String[] args) {
        System.out.println("------- Test Theater ------");
        System.out.println("--- First Reservation ---");
        Entities.Theater theater = new Theater("Theater 1", 100);
        theater.signIn(50, 10);
        System.out.println("Clients: " + theater.clients);
        System.out.println("Total revenue: " + theater.totalRevenue);
        System.out.println("--- Second Reservation ---");
        theater.signIn(60, 10);
        System.out.println("Clients: " + theater.clients);
        System.out.println("Total revenue: " + theater.totalRevenue);
        System.out.println("------- Test Theater ------");
    }
}

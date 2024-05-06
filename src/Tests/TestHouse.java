package Tests;

import Home.*;

import java.util.Arrays;

public class TestHouse {
    public static void main(String[] args) {
        System.out.println("------ Test House ------");
        Bedroom bedroom = new Bedroom(15, 1);
        Bedroom bedroom2 = new Bedroom(12, 1);
        Bedroom bedroom3 = new Bedroom(12, 1);
        Kitchen kitchen = new Kitchen(10, 0);
        LivingRoom livingRoom = new LivingRoom(20, 0);

        Room[] rooms = {bedroom, bedroom2, bedroom3, kitchen, livingRoom};
        House house = new House(rooms);
        System.out.println("Rooms: " + Arrays.toString(house.getRooms()));
        System.out.println("Area: " + house.getArea());
        System.out.println("Floors: " + house.getFloor());

        WC wc = new WC(5, 1);
        house.addRoom(wc);
        Bathroom bathroom = new Bathroom(10, 0);
        house.addRoom(bathroom);

        System.out.println("Rooms: " + Arrays.toString(house.getRooms()));
        System.out.println("Area: " + house.getArea());
        System.out.println("Floors: " + house.getFloor());

        house.addRoom(null);
        System.out.println("Rooms: " + Arrays.toString(house.getRooms()));

        System.out.println("--- Area by Room Type ---");
        System.out.println("Area by Bedroom: " + house.getAreaByRoomType(Bedroom.class));
        System.out.println("Area by WC: " + house.getAreaByRoomType(WC.class));
        System.out.println("Count by Bedroom: " + house.getRoomCountByType(Bedroom.class));
        System.out.println("Count by Kitchen: " + house.getRoomCountByType(Kitchen.class));
        System.out.println("------ Test House ------");
    }
}

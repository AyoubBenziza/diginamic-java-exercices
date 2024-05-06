package Home;

public class House {
    private Room[] rooms;

    public House(Room[] rooms) {
        for (Room room : rooms) {
            if (room == null || room.area <= 0 || room.floor < 0) {
                throw new IllegalArgumentException("Invalid room");
            }
        }
        this.rooms = rooms;
    }

    public double getArea() {
        double area = 0;
        for (Room room : rooms) {
            area += room.area;
        }
        return area;
    }

    public int getFloor() {
        int floor = 0;
        for (Room room : rooms) {
            if (room.floor > floor) {
                floor = room.floor;
            }
        }
        return floor + 1;
    }


    public Room[] getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        if (room == null || room.area <= 0 || room.floor < 0) {
            return;
        }
        Room[] newRooms = new Room[rooms.length + 1];
        System.arraycopy(rooms, 0, newRooms, 0, rooms.length);
        newRooms[rooms.length] = room;
        rooms = newRooms;
    }

    public double getAreaByRoomType(Class roomType) {
        double area = 0;
        for (Room room : rooms) {
            if (roomType.isInstance(room)) {
                area += room.area;
            }
        }
        return area;
    }

    public int getRoomCountByType(Class roomType) {
        int count = 0;
        for (Room room : rooms) {
            if (roomType.isInstance(room)) {
                count++;
            }
        }
        return count;
    }
}

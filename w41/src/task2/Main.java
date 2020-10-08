package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        Room room1 = new Room(4, 2,1,4);
        Room room2 = new Room(5,10,2,1);
        Room room3 = new Room(1,0,5,10);


        ArrayList<Room> rooms = new ArrayList();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        System.out.println(rooms);

        Building building = new Building(rooms,3,2,1);

        int lamps = 0;
        for (Room r : building.getRooms())
        {
            lamps += r.getNumberOfLamps();
        }

        System.out.println("Total number of lamps: " + lamps);

    }

}

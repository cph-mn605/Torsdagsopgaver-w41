package task2;

public class Room {
    private int wall;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int wall, int nODoors, int nOLamps, int nOWindows){
        this.wall=wall;
        this.numberOfDoors=nODoors;
        this.numberOfLamps=nOLamps;
        this.numberOfWindows=nOWindows;
    }

    @Override
    public String toString() {
        return "Room{" +
                "wall=" + wall +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfLamps=" + numberOfLamps +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }

    public int getWall() {
        return wall;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}

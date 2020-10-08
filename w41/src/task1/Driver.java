package task1;

public class Driver {
    private String Name;
    private int Age;

    public Driver(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String toString() {
        return " is driven by" + Name;
    }
}

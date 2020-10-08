package task1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Skoda", "2020", 2020, "SUV");
        Car car2 = new Car("BMW", "2006", 2002, "hatchback");

        Driver driver1 = new Driver(" Maja", 21);
        Driver driver2 = new Driver(" Oliver", 21);

        System.out.println(car1 + "" + driver1);
        System.out.println(car2 + "" + driver2);

        car1.getDriver();
        car2.getDriver();

    }
}


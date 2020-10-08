package task1;

public class Car {
    private String Make;
    private String Model;
    private int Year;
    private String BodyStyle;
    private String Driver;


    public Car(String make, String model, int year, String bodyStyle) {
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.BodyStyle = bodyStyle;
    }

    public  String toString() {
        return "Make: " + Make + " Model: " + Model + " Year: " + Year + " BodyStyle: " + BodyStyle;


    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }
}


public class Car {
    String make;
    String model;
    int year;
    String color;
    double price;
    boolean isRunning;
    boolean isLocked;
    String id;
    public Car(String make, String model, int year, String color, double price, boolean isRunning, boolean isLocked, String id) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isRunning = isRunning;
        this.isLocked = isLocked;
        this.id = id;
    }

    public void start() {
        System.out.println("Starting the car.");
    }

    public void stop() {
        System.out.println("Stopping the car.");
    }

    public void lock() {
        System.out.println("Locking the car.");
    }
    
}

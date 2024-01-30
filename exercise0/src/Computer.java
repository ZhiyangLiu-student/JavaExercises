public class Computer {
    double price;
    String color;
    double size;
    String brand;
    String opretingSystem;
    int weight;
    String processor;
    String storage;
    
    public Computer(double price, String color, double size, String brand, String opretingSystem, int weight,
            String processor, String storage) {
        this.price = price;
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.opretingSystem = opretingSystem;
        this.weight = weight;
        this.processor = processor;
        this.storage = storage;
    }
    
public void turnOn(){
    System.out.println("My Computer is On. It is " + brand);
}

public void turnOff(){
    System.out.println("My Computer is Off. It is " + brand);
}

public void getPrice(){
    System.out.println("My Computer is "+ price);
}


public static class wifi{
    boolean isWifi;

    public wifi(boolean isWifi) {
        this.isWifi = isWifi;
        
        if(isWifi == true){
            System.out.println("Computer can connect wifi!");
        }else System.out.println("Computer can not connect wifi!");
    }
}

public static class camera{
    boolean hasCamera;
    public camera(boolean hasCamera){
        this.hasCamera = hasCamera;
        if(hasCamera == true){
            System.out.println("Computer has camera!");
        }
        else System.out.println("Computer no camera!");
    }
}



}

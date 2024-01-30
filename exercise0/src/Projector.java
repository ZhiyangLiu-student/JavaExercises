public class Projector {
    double price;
    String color;
    double size;
    String brand;
    int weight;
    String model;
    String resolution;
    String audio;
    public Projector(double price, String color, double size, String brand, int weight, String model, String resolution,
            String audio) {
        this.price = price;
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.weight = weight;
        this.model = model;
        this.resolution = resolution;
        this.audio = audio;
    }

    public void getProjectorColor(){
        System.out.println("The projector is " + color);
    }
    
    public void getResolution(){
        System.out.println("The projector is " + resolution);
    }
    
    public void getProjectorSize(){
        System.out.println("The projector is " + size);
    }
}

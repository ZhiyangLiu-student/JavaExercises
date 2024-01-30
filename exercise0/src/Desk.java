public class Desk {
    String material;
    String size;
    String shape;
    String weight;
    String style;
    double price;
    String color;
    String function;

    public Desk(String material, String size, String shape, String weight, String style, String color, double price,
            String function) {
        this.material = material;
        this.size = size;
        this.shape = shape;
        this.weight = weight;
        this.style = style;
        this.price = price;
        this.color = color;
        this.function = function;
    }

    public void getDeskPrice() {
        System.out.println("This desk is " + price);
    }

    public void getDeskShape() {
        System.out.println("This desk is " + shape);
    }

    public void getMaterial() {
        System.out.println("This desk is " + material);
    }





}
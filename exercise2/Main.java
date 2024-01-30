public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle("Red", 3, 4);
        Shape rectangle = new Rectangle("Blue", 4, 5);
        Shape circle = new Circle("Green", 5);
        Shape square = new Square("Yellow", 4);


        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());


        System.out.println("Color of Triangle: " + ((Triangle) triangle).color);
        System.out.println("Color of Rectangle: " + ((Rectangle) rectangle).color);
        System.out.println("Color of Circle: " + ((Circle) circle).color);
        System.out.println("Color of Square: " + ((Square) square).color);
    }
}
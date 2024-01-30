import java.io.*;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle("Red", 3, 4);
        Shape rectangle = new Rectangle("Blue", 4, 5);
        Shape circle = new Circle("Green", 5);
        Shape square = new Square("Yellow", 4);

        serializeObject("triangle.ser", triangle);
        serializeObject("rectangle.ser", rectangle);
        serializeObject("circle.ser", circle);
        serializeObject("square.ser", square);

        Shape deserializedTriangle = (Shape) deserializeObject("triangle.ser");
        Shape deserializedRectangle = (Shape) deserializeObject("rectangle.ser");
        Shape deserializedCircle = (Shape) deserializeObject("circle.ser");
        Shape deserializedSquare = (Shape) deserializeObject("square.ser");

        System.out.println("Deserialized Triangle: " + deserializedTriangle.calculateArea());
        System.out.println("Deserialized Rectangle: " + deserializedRectangle.calculateArea());
        System.out.println("Deserialized Circle: " + deserializedCircle.calculateArea());
        System.out.println("Deserialized Square: " + deserializedSquare.calculateArea());
    }

    private static void serializeObject(String fileName, Object object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(object);
            System.out.println("Object serialized to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Object deserializeObject(String fileName) {
        Object object = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            object = ois.readObject();
            System.out.println("Object deserialized from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
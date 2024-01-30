public class Clock {
    String dial;
    String size;
    String shape;
    String material;
    String style;
    double price;
    String timeDisplay;
    String movement;
    public Clock(String dial, String size, String shape, String material, String style, String movement,
            String timeDisplay, double price) {
        this.dial = dial;
        this.size = size;
        this.shape = shape;
        this.material = material;
        this.style = style;
        this.price = price;
        this.timeDisplay = timeDisplay;
        this.movement = movement;
    }
    public void getClockPrice() {
        System.out.println("check price for clock");
    }
    public void getClockSize() {
        System.out.println("check size for clock");
    }
    public void getClockStyle() {
        System.out.println("check color for clock");
    }
}
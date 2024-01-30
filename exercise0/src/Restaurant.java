public class Restaurant {
    String name;
    String cuisine;
    double rating;
    String address;
    String phoneNumber;
    double averageCost;
    int seatingCapacity;
    String menuItems;
    
    public Restaurant(String name, String cuisine, double rating, String address, String phoneNumber, double averageCost, int seatingCapacity, String menuItems) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.averageCost = averageCost;
        this.seatingCapacity = seatingCapacity;
        this.menuItems = menuItems;
    }
    
    public String getRestaurantDetails() {
        return "Name: " + name + "\nCuisine: " + cuisine + "\nRating: " + rating;
    }
    
    public void reserveTable() {
        System.out.println("This table is reserved");
    }
    
    public void printMenu() {
        System.out.println("Menu:");
    }
}
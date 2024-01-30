

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1000, "silver", 15.6, "Apple", "MacOs", 20, "M1", "512G");
        computer1.getPrice();
        computer1.turnOn();
        computer1.turnOff();
        Computer computer2 = new Computer(1000, "silver", 15.6, "Apple", "MacOs", 20, "M1", "512G");
        computer2.getPrice();
        computer2.turnOn();
        computer2.turnOff();
        Computer computer3 = new Computer(1000, "black", 15.6, "Intel", "MacOs", 50, "I7", "512G");
        computer3.getPrice();
        computer3.turnOn();
        computer3.turnOff();
        
        Computer.wifi wifi1 = new Computer.wifi(true);
        Computer.camera camera1 = new Computer.camera(true);

        Projector projector1 = new Projector(4500, "white", 50, "Dell", 45, "ABX5", "1080p", "Bose");
        projector1.getProjectorColor();
        projector1.getProjectorSize();
        projector1.getResolution();
        Projector projector2 = new Projector(8000, "black", 30, "Samsung", 45, "LSP7T", "2k", "SENNHEISER");
        projector2.getProjectorColor();
        projector2.getProjectorSize();
        projector2.getResolution();
        Projector projector3 = new Projector(6000, "blue", 40, "Xiaomi", 45, "MoGo", "2k", "Mi");
        projector3.getProjectorColor();
        projector3.getProjectorSize();
        projector3.getResolution();

        Desk desk1 = new Desk("wood", "morden", "1.1m*1.8m*1.1m", "square", "writing desk", "50lbs", 300, "black");
        desk1.getDeskPrice();
        desk1.getDeskShape();
        desk1.getMaterial();
        Desk desk2 = new Desk("metal", "morden", "1.1m*2m*1.5m", "square", "writing desk", "70lbs", 500, "black");
        desk2.getDeskPrice();
        desk2.getDeskShape();
        desk2.getMaterial();
        Desk desk3 = new Desk("glass", "art", "1.1m*1.1m*1.1m", "square", "coffee desk", "20lbs", 100, "white");
        desk3.getDeskPrice();
        desk3.getDeskShape();
        desk3.getMaterial();

        Clock clock1 = new Clock("digital", "regular", "20", "glass", "automatic", "battery", "morden", 20);
        clock1.getClockPrice();
        clock1.getClockSize();
        clock1.getClockStyle();
        Clock clock2 = new Clock("digital", "regular", "20", "glass", "automatic", "battery", "art", 30);
        clock2.getClockPrice();
        clock2.getClockSize();
        clock2.getClockStyle();
        Clock clock3 = new Clock("digital", "regular", "20", "glass", "automatic", "battery", "morden", 10);
        clock3.getClockPrice();
        clock3.getClockSize();
        clock3.getClockStyle();

        Car car1 = new Car("bmw", "z4", 2023, "black", 20000, false, false, "178");
        car1.start();
        car1.lock();
        car1.stop();
        Car car2 = new Car("benz", "cla250", 2023, "black", 30000, false, false, "188");
        car2.start();
        car2.lock();
        car2.stop();
        Car car3 = new Car("audi", "a6", 2023, "black", 40000, false, false, "123");
        car3.start();
        car3.lock();
        car3.stop();

        Person person1 = new Person("Liu", 25, "888 lucky st", "9292222222", "123@edu.com", "student");
        person1.introduce();
        person1.startWork();
        person1.changeAddress("666 lucky st");
        Person person2 = new Person("Louis", 25, "222 lucky st", "9293322222", "1234@edu.com", "student");
        person2.introduce();
        person2.startWork();
        person2.changeAddress("777 lucky st");
        Person person3 = new Person("Lou", 25, "333 lucky st", "9294422222", "1235@edu.com", "student");
        person3.introduce();
        person3.startWork();
        person3.changeAddress("777 lucky st");

        Phone phone1 = new Phone("apple", "14", "ios", 128, "black", "on", "lock", "yes");
        phone1.powerOff();
        phone1.powerOn();
        phone1.charge();
        Phone phone2 = new Phone("samsung", "gg", "android", 128, "black", "off", "lock", "yes");
        phone2.powerOff();
        phone2.powerOn();
        phone2.charge();
        Phone phone3 = new Phone("apple", "13", "ios", 128, "black", "on", "unlock", "yes");
        phone3.powerOff();
        phone3.powerOn();
        phone3.charge();

        Book book1 = new Book("abc", "123", 2022, "fiction", "ttt", 12, 400, "12321412412");
        book1.getBookSummary();
        book1.calculateDiscountedPrice(400);
        book1.printBookDetails();
        Book book2 = new Book("jgfjkf", "1232323", 2021, "fiction", "ttt", 12, 500, "12321413543612");
        book2.getBookSummary();
        book2.calculateDiscountedPrice(500);
        book2.printBookDetails();
        Book book3 = new Book("gdgds", "123566", 2023, "fiction", "ttt", 12, 600, "1234654612412");
        book3.getBookSummary();
        book3.calculateDiscountedPrice(600);
        book3.printBookDetails();

        Movie movie1 = new Movie("kkkk", "ksadas", 2022, "love", "eng", 5, 120, "lows");
        movie1.getMovieDetails();
        movie1.playMovie();
        movie1.printActorsList();
        Movie movie2 = new Movie("gdsgs", "kwertwe", 2022, "love", "eng", 3, 120, "danny");
        movie2.getMovieDetails();
        movie2.playMovie();
        movie2.printActorsList();
        Movie movie3 = new Movie("k2323", "hfdhfgdh", 2022, "love", "eng", 4, 120, "liu");
        movie3.getMovieDetails();
        movie3.playMovie();
        movie3.printActorsList();

        Restaurant restaurant1 = new Restaurant("tba", "china", 5, "222 eat st", "666666666", 35, 20, "orangechicken");
        restaurant1.getRestaurantDetails();
        restaurant1.printMenu();
        restaurant1.reserveTable();
        Restaurant restaurant2 = new Restaurant("tbsfa", "china", 5, "333 eat st", "6", 35, 20, "orangechicken");
        restaurant2.getRestaurantDetails();
        restaurant2.printMenu();
        restaurant2.reserveTable();
        Restaurant restaurant3 = new Restaurant("tbaada", "china", 5, "555 eat st", "66663424223423", 35, 20, "orangechicken");
        restaurant3.getRestaurantDetails();
        restaurant3.printMenu();
        restaurant3.reserveTable();

    }
}

class Phone {
    String brand;
    String model;
    String operatingSystem;
    int storageCapacity;
    String color;
    String powerStatus; 
    String lockStatus; 
    String chargingStatus; 



    public Phone(String brand, String model, String operatingSystem, int storageCapacity, String color, String powerStatus, String lockStatus, String chargingStatus) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.color = color;
        this.powerStatus = powerStatus;
        this.lockStatus = lockStatus;
        this.chargingStatus = chargingStatus;
    }

    public void powerOn() {
        System.out.println(brand + " " + model + " powered on.");
    }

    public void powerOff() {
        System.out.println(brand + " " + model + " powered off.");
    }

    public void charge() {
        System.out.println(brand + " " + model + " is now charging.");
    }
}
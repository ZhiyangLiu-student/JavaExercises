class Person {
    String name;
    int age;
    String address;
    String phoneNumber;
    String email;
    String occupation;
    boolean isStudent;
    boolean isEmployed;

    public Person(String name, int age, String address, String phoneNumber, String email, String occupation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.occupation = occupation;
        this.isStudent = false;
        this.isEmployed = false;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old.");
    }

    public void changeAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Address changed to: " + newAddress);
    }

    public void startWork() {
        if (isEmployed) {
            System.out.println("I have started working.");
        } else {
            System.out.println("I am currently not employed.");
        }
    }
}
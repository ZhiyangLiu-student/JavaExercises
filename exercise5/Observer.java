package exercise5;

interface Observer {
    void update(String weather);
}
class DisplayUnit implements Observer {
    private String name;

    public DisplayUnit(String name) {
        this.name = name;
    }

    @Override
    public void update(String weather) {
        System.out.println(name + " Display: " + weather);
    }
}
package exercise5;

public class WeatherApp {
    public static void main(String[] args) {
        // Create the subject
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        Observer displayUnit1 = new DisplayUnit("Display 1");
        Observer displayUnit2 = new DisplayUnit("Display 2");
        Observer displayUnit3 = new DisplayUnit("Display 3");

        // Register observers with the subject
        weatherStation.addObserver(displayUnit1);
        weatherStation.addObserver(displayUnit2);
        weatherStation.addObserver(displayUnit3);

        // Simulate weather updates
        weatherStation.notifyObservers("Sunny");
        weatherStation.notifyObservers("Rainy");

        // Unregister an observer
        weatherStation.removeObserver(displayUnit2);

        // Simulate more weather updates
        weatherStation.notifyObservers("Cloudy");
    }
}
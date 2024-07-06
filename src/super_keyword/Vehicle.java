package super_keyword;

public class Vehicle {

    String color;
    double weight;

    Vehicle(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    void attribute() {
        System.out.println("Vehicle color: " + color);
        System.out.println("Vehicle weight: " + weight);
    }

}
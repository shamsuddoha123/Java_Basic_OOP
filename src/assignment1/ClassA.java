package assignment1;

public class ClassA {

    String carName;
    int carModel;

    //constructor
    ClassA(String carName, int carModel) {
        this.carName = carName;
        this.carModel = carModel;
    }

    //Default Modifier
    void display() {
        System.out.println("Car Name: " + carName);
        System.out.println("Car Model: " + carModel);
        System.out.println("\n");
    }
}
package super_keyword;

public class Car extends Vehicle {
    //color,weight,attribute();
    int gear;

    Car(String c, double w, int gear) {
        super(c, w);//calling the constructor of vehicle class.
        this.gear = gear;
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("Vehicle gear: " + gear);
    }

}
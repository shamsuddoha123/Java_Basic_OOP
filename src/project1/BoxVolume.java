package project1;

public class BoxVolume {
    public static void main(String[] args) {

        Box b1 = new Box(112,12,222);
        Box b2 = new Box(1133,12,222);


        b1.displayVol();
        b2.displayVol();

        Box b3 = new Box(112,12,222);
        b3.displayVol();

        Box b4 = new Box(1133,12,222);
        b4.displayVol();
    }
}
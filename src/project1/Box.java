package project1;

public class Box {

    double height, width, depth;//Instance variable

    Box(double height, double width, double depth) {
        this.height = height;//"this" keyword is used to prevent the hide of instance variable.
        this.width = width;
        this.depth = depth;
    }

    void displayVol() {
        System.out.println("Volume is " + height * width * depth);
        System.out.println();
    }
}

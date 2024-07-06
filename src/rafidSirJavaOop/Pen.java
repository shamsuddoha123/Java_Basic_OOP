package rafidSirJavaOop;

public class Pen {
    String color;
    String type;
    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }
//    void setColor(String color) {
//        this.color = color;
//    }
//    void setType(String type) {
//        this.type = type;
//    }
//    String getColor() {
//        return color;
//    }
//    String getType() {
//        return type;
//    }
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
    }
}
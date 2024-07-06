package static_method;

public class StaticMethod {

    void display1() {
        display2();
        System.out.println("I am not a static method.");
    }

    static void display2() {
        System.out.println("I am static method.");
    }

}
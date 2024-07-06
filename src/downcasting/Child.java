package downcasting;

public class Child extends Parent {
    int age;

    @Override
    void showMessage() {
        System.out.println("I am child.");
    }

    void show() {
        System.out.println("Child method is called.");
    }
}
package downcasting;

public class DowncastingExample {
    public static void main(String[] args) {
        Parent p = new Child();//upcasting
        p.name = "Shubham";

        /*Performing Downcasting Implicitly
        Child c = new Parent(); // it gives compile-time error.

        Parent p = new Parent();
        Child c = p;// it gives compile-time error.
        */

        /*Performing Downcasting Explicitly
        Child c = (Child) new Parent();// It throws the "ClassCastExceptiobn".

        Parent p = new Parent();
        Child c = (Child) new Parent();// It throws the "ClassCastExceptiobn".
        */

        /*Performing Downcasting Implicitly
        Parent p = new Child();
        Child c = p;// it gives compile-time error.
         */

        // Performing Downcasting Explicitly
        Child c = (Child) p;//down-casting

        c.age = 18;
        System.out.println(c.name);
        System.out.println(c.age);
        c.showMessage();
        c.show();
    }
}
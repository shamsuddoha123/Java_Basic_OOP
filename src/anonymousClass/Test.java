package anonymousClass;


public class Test {
    public static void main(String[] args) {
        Person person = new Person(){
            @Override
            void display() {
                System.out.println("Test Class.");
            }
        };
        person.display();
    }
}

package encapsulation1;

public class EncapTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Doha");
        p1.setAge(21);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}
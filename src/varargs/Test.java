package varargs;

public class Test {
    public static void main(String[] args) {

        AddDemo obj = new AddDemo();

        obj.add(10, 29);
        obj.add(10, 29, 34);
        obj.add(10, 29, -98, 343);
        obj.add(10);
        obj.add();

    }
}

package rafidSirJavaOop;

public class Static2 {

    int count = 0;

    public void increment() {
        count++;
    }

    public static void main(String args[]) {
        Static2 obj1 = new Static2();
        Static2 obj2 = new Static2();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is=" + obj1.count);
        System.out.println("Obj2: count is=" + obj2.count);
    }

}

package rafidSirJavaOop;

public class Static1 {

    static int count = 0;

    public void increment() {
        count++;
    }

    public static void main(String args[]) {
        Static1 obj1 = new Static1();
        Static1 obj2 = new Static1();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is=" + obj1.count);
        System.out.println("Obj2: count is=" + obj2.count);
    }

}
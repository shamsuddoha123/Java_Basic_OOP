package rafidSirJavaOop;

public class StaticMethod1 {
    static int i = 100;
    static String s = "Bangladesh";
    //Static method
    static void display()
    {
        System.out.println("i:"+i);
        System.out.println("i:"+s);
    }
    //non-static method
    void funcn()
    {
        //Static method called in non-static method
        display();
    }
    //static method
    public static void main(String args[])
    {
        StaticMethod1 obj = new StaticMethod1();
        //You need to have object to call this non-static method
        obj.funcn();

        //Static method called in another static method
        display();
    }
}

package rafidSirJavaOop;

public class Hello {
    String name;
    //Constructor
    Hello(){
        this.name="Hello World!";
    }

    public static void main(String[] args) {
        Hello obj=new Hello();
        System.out.println(obj.name);
    }
}
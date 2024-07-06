package JavaOOP;

public class StaticBlock {

    static int x;
    static String name;

    static{
        x=101;
        name="Doha";
    }
    static void display()
    {
        System.out.println("ID : "+x);
        System.out.println("Name : "+name);
    }
    public static void main(String[] args) {

        StaticBlock.display();
    }
}

package assignment1A;

public class ClassB {

    //Private access modifier
    private void display(){
        System.out.println("Private modifier is limited to the class only.\nYou can't access this method from outside of the class");
    }

    //Accessing private class
    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.display();
    }

    //Public Method
    public void display1(String n, int m){
        System.out.println("Car color = "+n);
        System.out.println("Car number = "+m);
        System.out.println("\n");
    }

    //Protected
    protected int display2(int kilo, int litter){
        return (kilo / litter);
    }
}
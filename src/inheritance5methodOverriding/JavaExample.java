package inheritance5methodOverriding;

public class JavaExample extends ParentClass {
    JavaExample() {
        System.out.println("Constructor of Child");
    }

    void disp() {
        System.out.println("Child Method");
        //Calling the disp() method of parent class
        super.disp();
    }

    public static void main(String args[]) {
        //Creating the object of child class
        JavaExample obj = new JavaExample();
        obj.disp();
    }
}

package inheritance1;

public class Teacher extends Person{

    //name,age,displayInformation1()
    String qualification;

    void displayInformation2()
    {
        displayInformation1();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + qualification);
    }

}
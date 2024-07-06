package overloading_constructor;

public class Teacher {

    String name,gender;
    int phone;

    Teacher()
    {
        System.out.println("No information");
        System.out.println();
    }

    Teacher(String na,String ge)
    {
        name=na;
        gender=ge;
    }

    Teacher(String na,String ge,int ph)
    {
        name=na;
        gender=ge;
        phone=ph;
    }

    void teacherInformation()
    {
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println();
    }

}

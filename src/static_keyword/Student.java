package static_keyword;

public class Student {

    String name;//Instance variable
    int id;//Instance variable
    static String universityName = "Noakhali Science and Technology University.";//Static/Class variable

    Student(String n, int i) {
        name=n;
        id=i;
    }

    void displayInformation()
    {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("University Name : " + universityName);
        System.out.println();
    }

}

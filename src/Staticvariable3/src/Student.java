public class Student {
    String name;
    int id;
    static String university="NSTU";
    Student(String n,int i)
    {
        name=n;
        id=i;
    }
    void diplay()
        {
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("UNiversity Name:"+university);
    }

}

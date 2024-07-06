package inheritance2;

public class PhysicsTeacher extends Teacher{
    //field of child class
    String mainSubject = "Physics";
    public static void main(String args[]){
        PhysicsTeacher obj = new PhysicsTeacher();
//accessing the fields of parent class
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
//accessing the method of parent class
        obj.does();
    }
}
package inherit_private_member;

public class Test {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();

        t1.setName("Doha");
        t1.setAge(7);
        t1.setQualification("BSSE in Software Engineering.");

        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getQualification());

        t1.displayInformation();

    }
}
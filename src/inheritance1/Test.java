package inheritance1;

public class Test {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();

        t1.name="Doha";
        t1.age=21;
        t1.qualification="BSSE in Software Engineering";

        t1.displayInformation2();


        Teacher t2 = new Teacher();

        t2.name="Anisul Islam";
        t2.age=40;
        t2.qualification="Software Engineer";

        t2.displayInformation2();

    }
}
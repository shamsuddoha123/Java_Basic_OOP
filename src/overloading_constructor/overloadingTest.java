package overloading_constructor;

public class overloadingTest {
    public static void main(String[] args) {

        Teacher teach1 = new Teacher();

        Teacher teach2 = new Teacher("MD. Shamsuddoha","male");
        teach2.teacherInformation();

        Teacher teach3 = new Teacher("Lisa","female", 88777);
        teach3.teacherInformation();
    }

}

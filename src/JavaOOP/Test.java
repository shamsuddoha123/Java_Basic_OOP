package JavaOOP;

public class Test {
    public static void main(String[] args) {

        Teacher teacher1=new Teacher("Anisul Islam","male",8878787);
        teacher1.displayInformation();

        Teacher teacher2=new Teacher("Alomgir Islam","male",23222);
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();

    }
}

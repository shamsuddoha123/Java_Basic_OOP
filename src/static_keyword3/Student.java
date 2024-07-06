package static_keyword3;

public class Student {

    static int count = 0;

    Student() {
        count++;
    }

    void totalStudent() {
        System.out.println("Total students in this class: " + count);
    }

}
package JavaProject1;

public class Student extends Person {
    private String studentId;
    private String major;
    private University university;

    // Constructor
    public Student(String name, int age, String studentId, String major, University university) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
        this.university = university;
    }

    // Method to display student information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        university.displayInfo();
    }
}
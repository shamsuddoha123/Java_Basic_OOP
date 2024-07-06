package JavaProject1;

public class Main {
    public static void main(String[] args) {
        // Create University objects
        University nstu = new University("NSTU", "Noakhali");
        University sust = new University("SUST", "Sylhet");
        University du = new University("DU", "Dhaka");

        // Create Student objects
        Student student1 = new Student("Md. Shamsuddoha", 21, "S12345", "Software Engineering", nstu);
        Student student2 = new Student("Ariful Islam", 21, "S67890", "Electrical Engineering", sust);
        Student student3 = new Student("Mehedi islam", 21, "S54321", "Mechanical Engineering", du);

        // Display type of institution
        University.displayType();
        System.out.println();

        // Display information for each student
        student1.displayInfo();
        System.out.println(); // Empty line for better readability

        student2.displayInfo();
        System.out.println(); // Empty line for better readability

        student3.displayInfo();
        System.out.println();
    }
}
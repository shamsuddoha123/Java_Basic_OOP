package JavaProject1;

public class University {
    private String name;
    private String location;
    private static final String TYPE = "Educational Institution";

    // Constructor
    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Static method
    public static void displayType() {
        System.out.println("Type: " + TYPE);
    }

    // Method to display university information
    public void displayInfo() {
        System.out.println("University: " + name);
        System.out.println("Location: " + location);
    }
}
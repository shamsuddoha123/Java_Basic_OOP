package rafidSirJavaOop;

public class Employee {
    int empId;
    String empName;

    //parameterized constructor with two parameters
    Employee(int id, String name){
        empId = id;
        empName = name;
    }
    void display(){
        System.out.println("Id : " + empId);
        System.out.println("Name : " + empName);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "James");
        e1.display();
        Employee e2 = new Employee(2, "Bob");
        e2.display();
    }
}

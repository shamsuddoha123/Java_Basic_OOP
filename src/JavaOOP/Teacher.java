package JavaOOP;

public class Teacher {

    String name, gender;
    int phone;

    Teacher(){
        System.out.println("No value");
    }

    Teacher(String na,String g,int num){
        name=na;
        gender=g;
        phone=num;
    }

    void setInformation(String n, String ge, int ph) {

        name = n;
        gender = ge;
        phone = ph;

    }

    void displayInformation() {
        System.out.println("Teacher's name : " + name);
        System.out.println("Teacher's gender : " + gender);
        System.out.println("Teacher's phone : " + phone);
        System.out.println();
    }
}

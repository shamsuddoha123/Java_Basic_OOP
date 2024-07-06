//Whats the use of blank final variable?
//Lets say we have a Student class which is having a field called Roll No. Since
//Roll No should not be changed once the student is registered, we can declare it
//as a final variable in a class but we cannot initialize roll no in advance for all the
//students(otherwise all students would be having same roll no). In such case we
//can declare roll no variable as blank final and we initialize this value during object
//creation like this:

package rafidSirJavaOop;

public class WhyWeUseBlankFinalVariable {
    //Blank final variable
    final int ROLL_NO;

    WhyWeUseBlankFinalVariable(int rnum) {
        //It must be initialized in constructor
        ROLL_NO = rnum;
    }

    void myMethod() {
        System.out.println("Roll no is:" + ROLL_NO);
    }

    public static void main(String args[]) {
        WhyWeUseBlankFinalVariable obj = new WhyWeUseBlankFinalVariable(1234);
        obj.myMethod();
        WhyWeUseBlankFinalVariable obj2 = new WhyWeUseBlankFinalVariable(2323);
        obj2.myMethod();
    }
}
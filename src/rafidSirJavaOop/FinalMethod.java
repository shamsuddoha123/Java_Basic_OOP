package rafidSirJavaOop;

public class FinalMethod {
    final void demo(){
        System.out.println("XYZ Class Method");
    }
}

class ABC extends FinalMethod{
    void ABC(){
        System.out.println("ABC Class Method");
    }

    public static void main(String args[]){
        ABC obj= new ABC();
        obj.demo();
    }
}

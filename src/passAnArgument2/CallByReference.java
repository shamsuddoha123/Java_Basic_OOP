package passAnArgument2;

public class CallByReference {

    String name;

    void change(CallByReference r2) {
        r2.name = "Doha";
    }

}
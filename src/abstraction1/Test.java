package abstraction1;

public class Test {
    public static void main(String[] args) {

        MobileUser mu;//Reference variable

        mu = new Rahim();
        mu.sendMessage();

        mu = new Karim();
        mu.sendMessage();
    }

}
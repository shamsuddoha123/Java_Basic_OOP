package string_demo;

public class String1 {
    public static void main(String[] args) {


        String str1 = "Hello World";
        String str2 = new String("Hello World");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        char[] ch1 = {'D', 'o', 'h', 'a'};
        System.out.println("ch1: " + new String(ch1));

        int len = str1.length();
        System.out.println("Length of str1: " + len);

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are the same.");
        } else {
            System.out.println("str1 and str2 are not the same.");
        }

        if (str1.contains("Hello")) {
            System.out.println("str1 contains Hello.");
        } else {
            System.out.println("str1 does not contain Hello.");
        }

        String str3 = "Doha";
        String str4 = new String("dOha");
        if (str3.equalsIgnoreCase(str4)) {
            System.out.println("str3 and str4 are the same.");
        } else {
            System.out.println("str3 and str4 are not the same.");
        }

        boolean contains = str3.contains("oha");
        System.out.println(contains);

        boolean b = str1.isEmpty();
        System.out.println(b);

    }
}

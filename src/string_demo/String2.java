package string_demo;

public class String2 {
    public static void main(String[] args) {


        String str1 = "Md. ";
        String str2 = "Shamsuddoha";

        String str3 = str1 + str2;
        System.out.println(str3);

        String str4 = str1.concat(str2);
        System.out.println(str4);

        String str5 = str4.toUpperCase();
        System.out.println(str5);

        String str6 = str4.toLowerCase();
        System.out.println(str6);

        boolean b = str1.startsWith("M");
        System.out.println(b);

        boolean last = str4.endsWith("a");
        System.out.println(last);

        String[] name = {"Doha", "Mehedi", "Ariful", "Avoy"};
        for (String x : name) {
            System.out.println(x);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(name[i]);
        }
    }
}

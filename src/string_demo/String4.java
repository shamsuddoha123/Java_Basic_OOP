package string_demo;

public class String4 {
    public static void main(String[] args) {


        String country = "This_is_m_y country.";
        System.out.println(country);


        String s = country.replace('i', 'j');
        System.out.println(s);


        String[] s3 = country.split("_");
        for (String x : s3) {
            System.out.print(x + " ");
        }

    }
}

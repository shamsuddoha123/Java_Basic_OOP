package string_demo;

public class StringPalindrome {
    public static void main(String[] args) {

        String s1 = "madam";
        StringBuffer s2 = new StringBuffer(s1);

        String s3 = s2.reverse().toString();

        if (s3.equals(s1)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }

    }
}

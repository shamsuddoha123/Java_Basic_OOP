package string_demo;

public class StringBuffer1 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Doha");
        System.out.println(sb);

        sb.append("is my name.");
        sb.append(25);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 5);
        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);

    }
}

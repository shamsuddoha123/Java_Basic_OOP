package string_demo;

public class String7 {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Anisul");

        sb.append(" 12.5");
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

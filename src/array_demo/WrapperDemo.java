package array_demo;

public class WrapperDemo {
    public static void main(String[] args) {

        //primitive -> object
        int x=30;
        Integer y=Integer.valueOf(x);
        System.out.println(y);

        int z=x;//Integer.valueOf(x); autoboxing(primitive -> object)
        System.out.println(z);

        //object -> primitive
        Double d=Double.valueOf(10.345);
        System.out.println(d);
        double w=d.doubleValue();
        System.out.println(w);

        double r=d; //d.doubleValue(); unboxing
        System.out.println(r
        );
    }
}

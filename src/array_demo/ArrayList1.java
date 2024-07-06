package array_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        System.out.println("Size : " + number.size());

        //Adding elements
        number.add(23);
        number.add(45);
        number.add(45677);
        number.add(0);
        number.add(-34);
        number.add(5, 345);

        //Arraylist printing method 1.
        System.out.println(number);

        //Arraylist printing method 1(for each loop).
        for (int x : number) {
            System.out.print(x + " ");
        }

        System.out.println();

        //Arraylist printing method 1(iterator method).
        Iterator itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        System.out.println("Size : " + number.size());

        //Removing elements
        number.remove(3);
        System.out.println(number);

//        number.removeAll(number);
//        System.out.println("After removing all elements : " + number);
//
//        number.clear();
//        System.out.println("After clearing all elements : " + number);

        //Checking if the arraylist is empty.
        boolean check = number.isEmpty();
        System.out.println(check);

        //Searching an element in arraylist.
        boolean b = number.contains(23);
        System.out.println(b);

        //Finding the index of an element in arraylist
        int index = number.indexOf(45677);
        System.out.println(index);

        //set and get method
        number.set(0, 2345555);
        System.out.println(number);

        int x = number.get(4);
        System.out.println(x);

    }
}
package array_demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        System.out.print("Enter the elements of list1 : ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list1.add(element);
        }
        System.out.println("List1 = " + list1);

        System.out.print("Enter the elements of list2 : ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list2.add(element);
        }
        System.out.println("List2 = " + list2);

        System.out.print("Enter the elements of list3 : ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list3.add(element);
        }
        System.out.println("List3 = " + list3);

        list3.addAll(list1);
        System.out.println("After adding : List3 = " + list3);

        boolean result = list1.equals(list2);
        System.out.println("list1 = list2 : " + result);

    }
}
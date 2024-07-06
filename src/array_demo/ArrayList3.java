package array_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> number = new ArrayList<>();

        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            number.add(i, element);
        }

        System.out.println(number);

        //Sorting
        Collections.sort(number);
        System.out.println("Ascending sorting : " + number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.println("Descending sorting : " + number);

    }
}

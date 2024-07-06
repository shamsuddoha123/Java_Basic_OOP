package array_demo;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        input.nextLine(); // Consume newline

        String[] str = new String[n];
        System.out.print("Enter the elements of array : ");
        String line = input.nextLine();
        String[] elements = line.split("\\s+");

        for (int i = 0; i < n; i++) {
            str[i] = elements[i];
        }

        for (String x : str) {
            System.out.println(x);
        }
    }
}

package array_demo;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        String[] str = {"Doha", "Mehedi", "Ariful", "Avoy", "Miraj", "Hasan"};

        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

        System.out.println();

        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");
        }

    }
}

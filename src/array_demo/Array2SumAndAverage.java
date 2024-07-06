package array_demo;

import java.util.Scanner;

public class Array2SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        double[] array = new double[n];
        double sum = 0;
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < array.length; i++)//for (int i = 0; i < n; i++)
        {
            array[i] = input.nextDouble();
        }
        for (int i = 0; i < array.length; i++)//for (int i = 0;i < n; i++)
        {
            sum += array[i];
        }
        double average = sum / n;
        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + average);
    }
}

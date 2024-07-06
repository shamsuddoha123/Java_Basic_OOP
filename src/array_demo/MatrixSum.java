package array_demo;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows of A matrix : ");
        int rowA = input.nextInt();
        System.out.println("Enter the number of columns of A matrix : ");
        int colA = input.nextInt();
        int[][] matA = new int[rowA][colA];
        System.out.println("Enter the number of rows of B matrix : ");
        int rowB = input.nextInt();
        System.out.println("Enter the number of columns of B matrix : ");
        int colB = input.nextInt();
        int[][] matB = new int[rowB][colB];


        //Taking input for matrix A.
        System.out.println("Enter elements of A matrix : ");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                System.out.printf("matA[%d][%d] = ", i, j);
                matA[i][j] = input.nextInt();
            }
            System.out.println();
        }


        //Taking input for matrix B.
        System.out.println("Enter elements of B matrix : ");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.printf("matA[%d][%d] = ", i, j);
                matB[i][j] = input.nextInt();
            }
            System.out.println();
        }


        //Printing A matrix.
        System.out.println("matA = ");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                System.out.print(" " + matA[i][j]);
            }
            System.out.println();
        }


        //Printing B matrix.
        System.out.println("matB = ");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(" " + matB[i][j]);
            }
            System.out.println();
        }


        //Matrix addition.
        int[][] sum = new int[rowA][colA];
        if (rowA == rowB && colA == colB) {
            System.out.println("matA + matB = ");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < colA; j++) {
                    sum[i][j] = matA[i][j] + matB[i][j];
                    System.out.print(" " + sum[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix addition not possible.");
        }


    }
}
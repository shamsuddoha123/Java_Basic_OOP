package array_demo;

public class NestedForEachLoop {
    public static void main(String[] args) {
        // Example matrix array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Using nested for-each loop to print each element
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next row after printing all elements in a row
        }
    }
}

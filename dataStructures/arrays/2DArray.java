import java.io.*;
import java.util.*;

public class Solution {
    public static int valueOfHourglass = Integer.MIN_VALUE;

    public static void main(String[] args) {

        // Get STDIN
        Scanner in = new Scanner(System.in);

        // Declare new 2D array
        int array[][] = new int[6][6];

        // Set the array to the matrix being passed in
        for(int row = 0; row < 6; row++) {
            for(int column = 0; column < 6; column++) {
                array[row][column] = in.nextInt();
            }
        }

        for(int row = 0; row <= 3; row++) {
            for(int column = 0; column <= 3; column++) {
                int total = getTopRow(array, row, column) + getMiddleRow(array, row + 1, column) + getBottomRow(array, row + 2, column);
                if(valueOfHourglass < total) {
                    valueOfHourglass = total;
                }
            }
        }


        System.out.println(valueOfHourglass);
    }

    private static int getTopRow(int[][] array, int row, int column) {
        int topRow[] = new int[3];
        for(int i = 0; i < 3; i++) {
            topRow[i] = array[row][column + i];
        }
        return Arrays.stream(topRow).sum();

    }

    private static int getMiddleRow(int[][] array, int row, int column) {
        return array[row][column + 1];
    }

    private static int getBottomRow(int[][] array, int row, int column) {
        int bottomRow[] = new int[3];
        for(int i = 0; i < 3; i++) {
            bottomRow[i] = array[row][column + i];
        }
        return Arrays.stream(bottomRow).sum();
    }
}

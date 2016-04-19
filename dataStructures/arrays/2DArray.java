import java.io.*;
import java.util.*;

public class Solution {
    public static int valueOfHourglass = 0;

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

        // Loop through the entire matrix to get the values of the
        // hourglass
        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 3; j++) {
                int total = getTopRow(array[i], j) + getMiddleRow(array[i + 1], j) + getBottomRow(array[i + 2], j);
                if(valueOfHourglass < total) {
                    valueOfHourglass = total;
                }
            }
        }


        System.out.println(valueOfHourglass);
    }

    private static int getTopRow(int[] array, int start) {
        int topRow[] = new int[3];
        for(int i = start; i < 3; i++) {
            topRow[i] = array[i];
        }
        return Arrays.stream(topRow).sum();

    }

    private static int getMiddleRow(int[] array, int start) {
        return array[start + 1];
    }

    private static int getBottomRow(int[] array, int start) {
        int bottomRow[] = new int[3];
        for(int i = start; i < 3; i++) {
            bottomRow[i] = array[i];
        }
        return Arrays.stream(bottomRow).sum();
    }
}

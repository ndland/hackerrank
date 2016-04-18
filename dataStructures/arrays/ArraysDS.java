import java.io.*;
import java.util.*;

public class ArraysDS {

    public static void main(String[] args) {
        // Get new scanner from System.in to get our arguments
        Scanner scan = new Scanner(System.in);

        // Create an array list to hold these values
        List<Integer> array = new ArrayList<Integer>();

        // Set our length
        int length = scan.nextInt();

        // Add the input to the array
        while(scan.hasNext()) {
            array.add(scan.nextInt());
        }

        // Loop through the array in reverse and print out the
        // values
        for(int i = length; i > 0; i--) {
            System.out.print(array.get(i - 1) + " ");
        }
    }
}

import java.io.*;
import java.util.*;

class Printer {
    // Generic printArray method required by the problem
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read integer array
        int n1 = Integer.parseInt(sc.nextLine().trim());
        Integer[] intArray = new Integer[n1];
        for (int i = 0; i < n1; i++) {
            // read each integer on its own line (matches your sample)
            intArray[i] = Integer.parseInt(sc.nextLine().trim());
        }

        // Read string array
        int n2 = Integer.parseInt(sc.nextLine().trim());
        String[] strArray = new String[n2];
        for (int i = 0; i < n2; i++) {
            strArray[i] = sc.nextLine();
        }

        // Call the generic printArray for both arrays
        Printer.printArray(intArray);
        Printer.printArray(strArray);

        sc.close();
    }
}

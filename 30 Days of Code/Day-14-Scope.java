import java.io.*;
import java.util.*;

class Difference
{
    private int elements[];
    public int maximum_difference;
    
    public Difference(int elements[])
    {
        this.elements = elements;
    }
    
    public void computeDifference()
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : elements) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        maximum_difference = Math.abs(max - min);
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = sc.nextInt();
        }

        Difference d = new Difference(elements);
        d.computeDifference();

        System.out.print(d.maximum_difference);
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public boolean ana(String a, String b)
    {
        // Lengths should be same
        if (a.length() != b.length()) {
            return false;
        }

        // strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // to character arrays
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        // Sort both arrays
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        return Arrays.equals(arrA, arrB);
    }
    public static void main(String[] args) 
    {       
        Solution ss = new Solution();
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        boolean result = ss.ana(a, b);
        
        if(result)
        {
            System.out.println("Anagrams");
        }
        else
        {
            System.out.println("Not Anagrams");   
        }
        
    }
}

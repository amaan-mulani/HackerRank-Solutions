import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
         System.out.println("================================");
        for(int i = 0; i<3; i++)
        {
            String word =  sc.next();
            int num = sc.nextInt();
            
            //15 spaces in the left for string, left align.
            //3 digit numbers, add zeros if needed.
            System.out.printf("%-15s%03d%n", word, num);
        }
         System.out.println("================================");
    }
    
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
     
     Scanner sc = new Scanner(System.in);
     
     int q = sc.nextInt();
     
     while(q-- > 0)
     {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        int sum = a; //to start with a
        int term = 1; //represents power
        
        for(int i = 0; i < n; i++)
        {
            sum += term * b; 
            System.out.print( sum + " ");
            
            term *= 2;  
        }
        System.out.println();
    }
    }
}

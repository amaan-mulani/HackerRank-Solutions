import java.io.*;
import java.util.*;

class Calculator
{
    public int power( int n, int p) throws Exception
    {
        if(n<0 || p<0)
        {
            throw new Exception("n and p should be non-negative");
        }
        
        int result =1;
        for(int i = 0; i<p; i++)
        {
            result *= n;
        }
        
        return result;
    }
}


public class Solution {

    public static void main(String[] args) {
       Calculator calc = new Calculator();
       
       Scanner sc = new Scanner(System.in);
       int t=sc.nextInt();
       
       while (t --> 0)
       {
        int n =sc.nextInt();
        int p =sc.nextInt();
        
        try
        {
            System.out.println(calc.power(n, p));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       }
    }
}

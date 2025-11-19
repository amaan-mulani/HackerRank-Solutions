import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        try
        {
            int t = Integer.parseInt(s);
            System.out.println(t);
        }
        catch(Exception e)
        {
            System.out.println("Bad String");
        }
    }
}

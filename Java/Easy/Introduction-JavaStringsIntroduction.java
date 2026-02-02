import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        String a = new String();
        String b = new String();
        
        Scanner sc = new Scanner(System.in);
        a=sc.nextLine();
        b=sc.nextLine();
        
        //Size of both
        System.out.println(a.length()+ b.length());
        
        //Checking lexilogical order
        if(a.compareTo(b)>0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        //Converting first letter to capital
        String capA= a.substring(0,1).toUpperCase() + a.substring(1);
        String capB= b.substring(0, 1).toUpperCase()+ b.substring(1);
        
        System.out.println(capA+ " " +capB);
    }
}

import java.io.*;
import java.util.*;

class Fact
{
    public int factorial()
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
   
        int result =1;

        for(int i = 1; i<=number; i++)
        {
            result *= i;
        }
        return result;
    }
}
class Solution
{
    public static void main(String[] args)
    {
        Fact f = new Fact();
        int answer = f.factorial();
        System.out.println(answer);
        
    }
}

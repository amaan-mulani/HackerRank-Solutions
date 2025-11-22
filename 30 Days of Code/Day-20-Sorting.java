import java.io.*;
import java.math.*;
import java.util.*;


class Solution{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n ; i++ )
        {
            a[i] = sc.nextInt();
        }
        int totalSwaps = 0;
        for  (int i= 0; i<n;i++)
        {
            int swapsThisRound = 0;
            for(int j = 0; j < n-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                    swapsThisRound++;
                    totalSwaps++;     
                }
               
            }
            if(swapsThisRound==0)
            {
                break;
            }
        }
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }
}


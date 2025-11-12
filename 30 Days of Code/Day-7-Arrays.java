import java.util.*;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        //inputting values in an array
        for(int i = 0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }  
        
        //printing in reverse order
        for(int i=n-1; i>=0;i--)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        
    }
}

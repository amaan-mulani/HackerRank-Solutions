import java.io.*;
import java.math.*;
import java.util.*;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int nums[][] = new int[6][6];
        for(int i = 0; i< 6;i++)
        {
            for(int j = 0; j<6; j++)
            {
                 nums[i][j]=sc.nextInt();
            }
        }
        
        int maxSum = Integer.MIN_VALUE;
        
        for(int i = 0; i<4;i++)
        {
            for(int j = 0; j<4; j++)
            {
                 int sum = nums[i][j] + nums[i][j+1] + nums[i][j+2]
                          +nums[i+1][j+1]
                          +nums[i+2][j] + nums[i+2][j+1] + nums[i+2][j+2];
                          
                 maxSum = Math.max(maxSum, sum);           
            }
        }
        System.out.println(maxSum);
    }
}

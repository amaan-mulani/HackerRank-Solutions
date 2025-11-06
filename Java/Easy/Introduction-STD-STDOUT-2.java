import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int first;
        double second;
        String third;
        Scanner s = new Scanner(System.in);
        first=s.nextInt();
        second=s.nextDouble();
        s.nextLine();
        third=s.nextLine();
        
        System.out.println("String: "+third);
        System.out.println("Double: "+second);
        System.out.println("Int: "+first);
    }
}

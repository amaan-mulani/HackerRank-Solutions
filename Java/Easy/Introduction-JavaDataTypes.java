import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (sc.hasNext()) {
            try {
                long n = sc.nextLong();  // try reading long
                System.out.println(n + " can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                    System.out.println("* int");

                System.out.println("* long"); // fits all remaining long values
            }
            catch (Exception e) {
                String num = sc.next(); // read the huge number as STRING
                System.out.println(num + " can't be fitted anywhere.");
            }
        }
    }
}

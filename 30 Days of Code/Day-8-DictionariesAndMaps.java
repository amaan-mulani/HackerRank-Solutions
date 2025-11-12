import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //number of entries in a phonebook
        sc.nextLine();
        
        //Creating a hashmap
        Map<String, String> phoneBook = new HashMap<>();
        
        for(int i = 0; i<n;i++)
        {
            String name = sc.next();
            String phone = sc.next();
            phoneBook.put(name, phone); //stores key value pairs
        }
        
        while(sc.hasNext())
        {
           String query = sc.next();
           
           if(phoneBook.containsKey(query))
           {
            System.out.println(query + "=" +phoneBook.get(query));
           } 
           else
           {
            System.out.println("Not found");
           }
        }
        
        
    }
}

import java.io.*;
import java.util.*;

abstract class Book
{
    abstract void display();
}

class MyBook extends Book
{
    String title;
    String author;
    int price;
    
    public MyBook(String title, String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void display()
    {
        System.out.println("Title: " +title);
        System.out.println("Author: " +author);
        System.out.println("Price: " +price);
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        
        MyBook mb = new MyBook(title, author, price);
        mb.display();
    }
}

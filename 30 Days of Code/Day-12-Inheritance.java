import java.io.*;
import java.util.*;

class Person 
{
    protected String firstName;
    protected String lastName;
    protected int id;
    
    Person(String firstName, String lastName, int id)
    {
        this.firstName =firstName;
        this.lastName = lastName;
        this.id = id;
        
    }
    
    public void printPerson()
    { 
        System.out.println("Name: " +lastName + ", " + firstName);
        System.out.println("ID: " +id);
    }
}

class Student extends Person
{
    int testScores[];
    
    public Student(String firstName, String lastName, int id, int scores[])
    {
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    
    public char calculate()
    {
        int sum = 0;
        for(int score : testScores)
        {
            sum += score;
        }
        int avg = sum/ testScores.length;
        
        if (avg >= 90 && avg <= 100)
        {
            return 'O';
        } 
        
        else if (avg >= 90 && avg <= 100)
        {return 'E';} 
        else if (avg >= 70 && avg <= 80) 
        {return 'A';}
        else if (avg >= 55 && avg <= 70) 
        {return 'P';}
        else if (avg >= 40 && avg <= 55) 
        {return 'D';}
        else 
        {return 'T';}
    }
}


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int id = sc.nextInt();
        
        int n = sc.nextInt();
        int scores[] = new int[n];
        for(int i = 0; i<n;i++)
        {
            scores[i] = sc.nextInt();
        }
        
        Student s = new Student(firstName, lastName, id, scores);
        s.printPerson();
        System.out.println("Grade: " +s.calculate());
        
    }
}

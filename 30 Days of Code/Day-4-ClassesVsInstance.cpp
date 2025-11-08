//Wrote the Class as well main.


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Person
{
    public:
    int age;
    
    //Constructor
    Person(int intitialAge)
    {
        if(intitialAge<0)
        {
            cout<<"Age is not valid, setting age to 0."<<endl;
            age=0;
        }
        else 
        {
            age = intitialAge;
        }
        
    }
    
    //Method to check the category according to the age
    void amIOld()
    {
        if(age<13)
        {
            cout<<"You are young."<<endl;
        }
        else if(age>=13 && age<18)
        {
            cout<<"You are a teenager."<<endl;
        }
        
        else 
        {
            cout<<"You are old."<<endl;
        }
    }
    
    //Method to increaase by 1
    void yearPasses()
    {
        age++;
    }
};
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t;
    cin>>t;
    for(int i =0; i<t;i++)
    {
        int age;
        cin>>age;
        Person p(age);
        p.amIOld();
        for(int j=0; j<3; j++)
        {
            p.yearPasses();
        }
        p.amIOld();
        cout<<endl;
    }
    return 0;
}

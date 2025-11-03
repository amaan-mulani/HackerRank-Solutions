#include <cmath>
#include <cstdio>
#include<iomanip>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int i = 4;
    double d = 4.0;
    string s = "HackerRank "; 
      
    int a;
    double b;   
    string c;
    
    cin>>a;
    cin>>b;
    getline(cin >>ws,c); //ignores whitespace
    
    cout<<a+i<<endl;   
    cout << fixed << setprecision(1) << b + d << endl; //one decimal space
    cout<<s+c<<endl;
    return 0;
}

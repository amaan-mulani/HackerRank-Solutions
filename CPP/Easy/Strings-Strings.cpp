#include <iostream>
#include <string>
using namespace std;

int main() {
	// Complete the program
  string a,b;
  cin>>a>>b;
  
  int len1=a.size();
  int len2=b.size();
  cout<<len1<<" "<<len2<<endl;
  
  cout<<a+b<<endl;
  
      //Swap first characters
    char temp = a[0];  // store first char of a
    a[0] = b[0];       // replace a's first char with b's first char
    b[0] = temp;       // replace b's first char with original a's first char

    // Print modified strings separated by space
    cout << a << " " << b << endl;
    return 0;
}
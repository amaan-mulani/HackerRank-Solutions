#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
	// Complete this function
    vector<int>result; //to store the integer
    stringstream ss(str); 
    
    int number;
    char ch; //stores the commas
    
    while(ss>>number)
    {
        result.push_back(number); //stores the numbers in vector
        ss>>ch;     //reads and removes the commas
    }
    return result;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}
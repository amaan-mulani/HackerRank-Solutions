//Had to write the whole main 

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int T; // number of test cases
    cin >> T;
    
    while (T--) {
        string s;
        cin >> s;

        string even = "", odd = "";
        
        // Loop through each character
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)
                even += s[i];
            else
                odd += s[i];
        }
        
        // Print even and odd parts separated by space
        cout << even << " " << odd << endl;
    }
    return 0;
}

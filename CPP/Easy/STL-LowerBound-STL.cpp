#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;
    cin>>n;
    
    vector<int>v(n);
    for(int i=0; i<n; i++)
    {
        cin>>v[i];
    }
    
    int q;
    cin>>q;
    while (q--) 
    {
        int x;
        cin>>x;

    //using lower bound to find values
    auto it= lower_bound(v.begin(),v.end(),x);
    
    int index = it - v.begin() + 1;  // convert to 1-based index

        // check if element found
        if (it != v.end() && *it == x) {
            cout << "Yes " << index << endl;
        } else {
            cout << "No " << index << endl;
        }
    } 
   
    return 0;
}

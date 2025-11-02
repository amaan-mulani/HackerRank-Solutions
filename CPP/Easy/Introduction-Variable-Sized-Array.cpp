#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n,q;
    cin>>n>>q;
    
    vector<vector<int>> arr(n);
    
    //reading all the arrays
    for (int i = 0; i < n; i++) {
        int size;
        cin>>size; //number of elements to be put in the "Right now" array.
        
        arr[i].resize(size); //sets the size of that array depending on the input.
        
        for(int j = 0; j < size; j++) //reading the elements
        {
            cin>>arr[i][j];
        }
    }
    //for queries
    for (int k = 0; k < q; k++) {
        int i, j;
        cin>>i>>j;      //here i is "which array" & j is "which element"
        cout<<arr[i][j]<<endl;
    }
    return 0;
}
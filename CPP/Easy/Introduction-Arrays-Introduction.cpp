#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;
    cin>>n;
    
    int arr[1000];
    
    //entering elements in array
    for (int i = 0; i<n; i++) {
        cin>>arr[i];
    }
    
    //reversing the array
    for (int i = n-1; i>=0; i--) {
        cout<<arr[i]<<" ";
    }
    return 0;
}

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    vector<int>v;
    
    for(int i=0;i<n;i++)
    {
        int x;
        cin>>x;
        v.push_back(x);
    }
    
    int pos;
    cin>>pos;
    v.erase(v.begin()+(pos -1));
    
    int r1,r2;
    cin>>r1>>r2;
    v.erase(v.begin()+(r1-1),v.begin()+(r2-1));
    
    cout<<v.size()<<endl;
    for (int j=0; j<v.size(); j++) {
        cout<<v[j]<<" ";
    }
    return 0;
}

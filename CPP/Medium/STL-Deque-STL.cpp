#include <iostream>
#include<vector>
#include <deque> 
using namespace std;

void printKMax(const vector<int>& arr, const int n, const int k){
	//Deque(part of C++ STL) are sequence containers with dynamic sizes that can be expanded or contracted on both ends (either its front or its back).
    deque<int> dq; //declarion of the deque
    
    for(int i =0 ; i<n;i++)//Looping through array elements
    {
        if(!dq.empty() && dq.front() == i-k)
        {
            dq.pop_front();
        }
        while(!dq.empty() && arr.at(dq.back()) < arr.at(i))
        {
            dq.pop_back();
        }
        
        dq.push_back(i);
        
        if(i>=k - 1)
        {
            cout<<arr[dq.front()]<<" ";            
        }
        
        
    }
    cout<< endl;
}

int main(){
  
	int t;
	cin >> t;
	while(t>0) {
		int n,k;
    	cin >> n >> k;
        vector<int> arr;
    	int i;
    	for(i=0;i<n;i++)
        {
            int ai;
            cin>>ai;
            arr.push_back(ai);
        }
    	printKMax(arr, n, k);
    	t--;
  	}
  	return 0;
}
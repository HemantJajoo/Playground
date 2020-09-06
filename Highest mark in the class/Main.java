#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  int arr[a];
  for(int i=0;i<a;i++)
  {
    cin>>arr[i];
  }
  int max=arr[0];
  for (int j = 1; j < a; j++) 
  {   
    if (arr[j] > max) 
            max = arr[j]; 
  }
    cout<<max; 
}
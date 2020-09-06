#include<bits/stdc++.h>
using namespace std;
int main() 
{    
    int m,n,i,count=0,j,sum=0;
    cin>>m>>n;//input
    int mars[m],earth[n],unique[m-n];
    for(i=1;i<=m;i++)//m stones from 1 to m weight in mars
    	mars[i-1]=i;	
    for(i=0;i<n;i++)
    	cin>>earth[i];	
    sort(earth,earth+n);//use incase if we have unsorted input for stones in earth
    j=0;
    for(i=0;i<m;i++)//finding the unique stones alone
    {
    	if(j<n && mars[i]==earth[j])
    		j++;
    	else
    		unique[count++]=mars[i];
	}
	count=0;
	for(i=0;i<m-n;i++)//finding maximum stones. To have max stones weight should be minimum
	{
		sum=sum+unique[i];
		if(sum<=m)
			count++;
		else
			break;
	}
	cout<<count;
}
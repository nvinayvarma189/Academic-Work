#include<stdio.h>
#include<stdlib.h>
int main()
{
	int i,ar[10],n,j,k,p,a,t,start,end,mid,c;
	for(i=0;i<10;i=i+1){
		
		scanf("%d",&ar[i]);
		}
	for(i=0;i<=9;i=i+1){
		printf("ar[%d]=%d\n",i,ar[i]);
		}
	i=0;
	j=1;
	k=0;
	
	while(k<10)
	{
		while(j<10)
		{
			if(ar[i]>ar[j])
			{
				t=ar[i];
				ar[i]=ar[j];
				ar[j]=t;
			}
			i=j;
			j=j+1;	
			
		}
		i=0;
		j=1;
		k=k+1;
	}
	c=0;
	printf("enter the searching number");
	scanf("%d",&n);
	start=0;
	end=9;
	while(start<=end)
	{
	mid=(start+end)/2;
	if(n==ar[mid])
	{
	printf("number is present");
	c=1;
	break;
	}
	else if(n<=ar[mid])
	{
		end=mid-1;
		start=start;
	}
	else if(n>=ar[mid])
	{
		end=end;
		start=mid+1;
	} 
	}
	if(c==0)
		printf("number is not present");
	return 0;
}
	
		

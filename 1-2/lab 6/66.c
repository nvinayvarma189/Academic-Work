#include<stdio.h>
int main()
{
	int i,c,n,a[20],k;
	printf("Enter the size of the array");
	scanf("%d",&n);
	for (i=0;i<n;i++)
	    scanf("%d",&a[i]);
	for (i=0;i<n;i++)
	{
	
	 for (k=0;k<=n;k++)
         {
	     if (i==k)
	        continue;
	     else if (a[i]==a[k])
		      printf(" %d is in position %d and its dublicate is in position %d\n",a[i],i+1,k+1);
	              
	  }
	}
}		
			 
				
		
	
	

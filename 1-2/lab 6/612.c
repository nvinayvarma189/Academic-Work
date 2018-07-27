#include<stdio.h>
int main()
{
	int i,j=0,k,a[20],n;
	printf("Enter the size of the elements\n");
	scanf("%d",&n);
	printf("Enter a search key\n");
	scanf("%d",&k);
	printf("Enter array elements\n");
	for (i=0;i<n;i++)
	{
	    scanf(" %d",&a[i]);
	}
	for (i=0;i<n;i++)
	{
	    if (k==a[i])
	    {
	     printf("Key found\n");
	     j=1;
	    }
	}
	if (j==0)
	   printf("Key not found\n");
}

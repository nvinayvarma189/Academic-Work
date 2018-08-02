#include<stdio.h>
int main()
{
	int a[10],b[10],i,n=0,c=0;
	printf("Enter the array elements of first array\n");
	for (i=0;i<10;i++)
	    scanf("%d",&a[i]);
	printf("Enter the array elements of second array\n");
	for (i=0;i<10;i++)
	    scanf("%d",&b[i]);
	for (i=0;i<10;i++)
	{
		if (a[i]==b[i])
	           n=1;
		else 
		     c=1;
	}
	if (c==1)
	   printf("The array not are same\n");
	else
	    printf("The array is same\n");
}

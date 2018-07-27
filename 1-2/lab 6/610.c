#include<stdio.h>
int main()
{
	int ar[20],n,i,j,d,t;
	printf("enter the size\n");
	scanf("%d",&n);
	printf("enter the array\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&ar[i]);
	}
	printf("enter the position\n");
	scanf("%d",&d);
	for(i=0;i<n;i++)
	{
		if (i==d)
			break;
		else
		{
			j=i;
			t=ar[0];
			for(j=0;j<n;j++)
			{
				ar[j]=ar[j+1];
			}
			ar[n-1]=t;
		}
	}
	printf("the new array\n");
	for(i=0;i<n;i++)
	{
		printf("%d ",ar[i]);
	}
	printf("\n");
	return 0;
}
	
			

#include<stdio.h>
int main()
{
	int ar[20],i,j,k,t;
	printf("enter the array\n");
	for(i=0;i<10;i++)
		scanf("%d",&ar[i]);
	printf("enter the position and the element\n");
	scanf("%d %d",&j,&k);
	for(i=0;i<10;i++)
	{
		if (i==j)
		{
			for(i=j;i<11;i++)
			{
				t=ar[i];
				ar[i]=k;
				k=t;
			}
		}
	}
	printf("the new array\n");
	for(i=0;i<11;i++)
		printf("%d ",ar[i]);
	return 0;
}
				

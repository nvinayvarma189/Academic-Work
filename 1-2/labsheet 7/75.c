#include<stdio.h>
int main()
{
	int size,i,j,count;
	printf("Enter size of array ");
	scanf("%d",&size);
	int a[size];
	printf("Enter the array elements\n");
	for(i=0;i<size;i++)
	{
		
		scanf("%d",&a[i]);
	}
	printf("Entered array is\n");
	for (i=0;i<size;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\n");
	for (i=0;i<size-1;i++)
	{
		if (a[i] == 999)
		{
			i = i + 1;
		}
		else
		{
			count = 0;
			for (j=i+1;j<size;j++)
			{
				if (a[i] == a[j])
				{	
					count = count + 1;
					a[j] = 999;
				}
			}
			if (count != 0)
			{
				printf("%d is repeated %d times\n",a[i],count+1);
			}
		}
	}
	return 0;
}
		
		









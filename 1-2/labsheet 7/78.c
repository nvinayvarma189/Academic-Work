#include<stdio.h>
int main()
{
	int size,i,j,sum;
	printf("Enter size of matrix ");
	scanf("%d",&size);
	int a[size][size];
	printf("Enter the array elements\n");
	for (i=0;i<size;i++)
	{
		for (j=0;j<size;j++)
		{
			
			scanf("%d",&a[i][j]);
		}
	}
	printf("Entered matrix is \n");
	for (i=0;i<size;i++)
	{
		for (j=0;j<size;j++)
		{
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	sum = 0;
	for (i=0;i<size;i++)
	{
		sum = sum + a[i][i];
	}
	printf("Sum of the elements of the left-diagonal is %d\n",sum);
	sum = 0;
	for (i=0;i<size;i++)
	{
		j = size-i-1;
		sum = sum + a[i][j];
	}
	printf("Sum of elements of the right-diagonal is %d\n",sum);
	return 0;
}

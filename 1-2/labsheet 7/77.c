#include<stdio.h>
int main()
{
	int size,i,j,min;
	printf("Enter size of matrix\n");
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
	min = a[0][0];
	for (i=0;i<size;i++)
	{
		if (a[i][i] < min)
		{
			min = a[i][i];
		}
	}
	printf("The smallest element in the main diagonal is %d\n",min);
	min = a[0][size-1];
	for (i=0;i<size;i++)
	{
		j = size-i-1;
		if (a[i][j] < min)
		{
			min = a[i][j];
		}
	}
	printf("The smallest element in the second diagonal is %d\n",min);
	return 0;
}
	

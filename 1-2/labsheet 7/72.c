#include<stdio.h>
int main()
{
	int m,n,i,j,sum;
	printf("Enter the value of m \n");
	scanf("%d",&m);
	printf("Enter the value of n \n");
	scanf("%d",&n);
	int a[m][n],b[n][m];
	printf("Enter the array elements\n ");
	for (i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			
			scanf("%d",&a[i][j]);
		}
	}
	printf("Matrix A which you have entered is \n");
	for (i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	sum = 0;
	for (i=0;i<m;i++)
	{
		for (j=0;j<n;j++)
		{
			sum = sum + a[i][j];
		}
	}
	printf("The sum of all elements in the matrix is %d\n",sum);
	printf("The row-wise sum of all elements are \n");
	for (i=0;i<m;i++)
	{
		sum = 0;
		for (j=0;j<n;j++)	
		{
			sum = sum + a[i][j];
		}
		printf("%d\n",sum);
	}
	printf("The collum-wise sum of all elements are \n");
	for (i=0;i<n;i++)
	{
		sum = 0;
		for (j=0;j<m;j++)
		{
			sum = sum + a[i][j];
		}
		printf("%d\n",sum);
	}
	for (i=0;i<m;i++)
	{
		for (j=0;j<n;j++)
		{
			b[j][i] = a[i][j];
		}
	}
	printf("The transpose of matrix A is\n");
	for (i=0;i<n;i++)
	{
		for (j=0;j<m;j++)
		{
			printf("%d ",b[i][j]);
		}
		printf("\n");
	}
	return 0;
}















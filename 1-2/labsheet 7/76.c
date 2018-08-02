#include<stdio.h>
int main()
{
	int m,n,i,j;
	printf("Enter the value of m\n");
	scanf("%d",&m);
	printf("Enter the value of n\n");
	scanf("%d",&n);
	int a[m][n],sums[m],prod[n],sum,pro,min,max;
	printf("Enter the array elements\n");
	for (i=0;i<m;i++)
	{
		for (j=0;j<n;j++)
		{
		
			scanf("%d",&a[i][j]);
		}
	}
	printf("Entered matrix is \n");
	for (i=0;i<m;i++)
	{
		for (j=0;j<n;j++)
		{
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	for (i=0;i<m;i++)
	{
		sum = 0;
		for (j=0;j<n;j++)
		{
			sum = sum + a[i][j]; 
		}
		sums[i] = sum;
	}
	for (i=0;i<n;i++)
	{
		pro = 1;
		for (j=0;j<m;j++)
		{
			pro = pro*a[j][i];
		}
		prod[i] = pro;
	}
	min = sums[0];
	for (i=0;i<m;i++)
	{
		if (sums[i]<min)
		{
			min = sums[i];
		}
	}
	printf("The smallest sum is %d\n",min);
	max = prod[0];
	for (i=0;i<n;i++)
	{
		if (prod[i] > max)
		{
			max = prod[i];
		}
	}
	printf("The largest product is %d\n",max);
	return 0;
}























	

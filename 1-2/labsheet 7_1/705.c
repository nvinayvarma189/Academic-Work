#include<stdio.h>
int main()
{
	int m,n,i,j,cnt=1;
	printf("enter values of 'm' and 'n' :\n ");
	scanf("%d%d",&m,&n);
	int a[m][n];
	printf("enter the values of binary matrix:\n");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	printf("inputed binary matrix is:\n");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d \t",a[i][j]);
		}
		printf("\n");
	}
	printf("run length encoding:\n");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n-1;j++)
		{
			if(a[i][j]==a[i][j+1])
			{
				cnt=cnt+1;
			}
			else
			{
				printf("%d\t",cnt);
				cnt=1;
			}
		
		}
		printf("%d \n",cnt);
		cnt=1;
	}
	return 0;
}


#include<stdio.h>
int main()
{
	int i,j,n;
	char a[10],*p;
	printf("input limit: ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf(" %c",&a[i]);
	}
	p=a;
	printf("elements of array \n");
	for(i=0;i<n;i++)
	{
		printf("%c",*(p+i));
	}
	return 0;
} 

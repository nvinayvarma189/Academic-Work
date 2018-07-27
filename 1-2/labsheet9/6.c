#include<stdio.h>
int main()
{
	int i,j,a[10],*p,n;
	printf("enter a limit: ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	p=&a;
	for(i=0;i<n;i++)
	{
		printf("%p \t",&a[i]);
	}
	printf("\n");
	for(i=0;i<n;i++)
	{
		printf("%u \t",p+i);
	}
	return 0;
}

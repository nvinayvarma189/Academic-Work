#include<stdio.h>
int main()
{
	int *p,a[20],n,i;
	printf("input a limit: ");
	scanf("%d",&n);
	p=a;
	printf("base address of array \n");
	for(i=0;i<n;i++)
	{
		printf("%d\t",p+i);
	}
	p++;
	printf("%d",p);
	printf("\nNow..base address of array\n");
	for(i=0;i<n;i++)
	{
		printf("%d\t",p+i);
	}
	return 0;
}

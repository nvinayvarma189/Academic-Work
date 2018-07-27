#include<stdio.h>
int main()
{
	int i,n;
	char *p,a[10];
	printf("input a limit: ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf(" %c",&a[i]);
	}
	p=a;
	for(i=0;i<n;i++)
	{
		printf("%C",*(p+i));
	}
	return 0;
}
	

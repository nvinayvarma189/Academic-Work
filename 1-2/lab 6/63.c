#include<stdio.h>
#define N 10
int main()
{
	int a[N],s=0,i;
	float m;
	printf("Enter the elements\n");
	for(i=0;i<N;i++)
	{
	    scanf("%d",&a[i]);
	}
	for(i=0;i<N;i++)
	{
	 s=s+a[i];
	}
	m=(float)s/N;
	printf("The mean of the elements is %.2f\n",m);
	return 0;
}

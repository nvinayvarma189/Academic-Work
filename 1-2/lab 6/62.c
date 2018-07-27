#include<stdio.h>
#define N 10
int main()
{
	int a[N],l,i;
	printf("Enter the elements\n");
	for(i=0;i<N;i++)
	{
	    scanf(" %d",&a[i]);
	}
	l=a[0];
	for(i=1;i<N;i++)
	{
	    if (l>a[i])
		continue;
	    else
		 l=a[i];
	}
	printf("The largest element is %d\n",l);
	return 0;
}

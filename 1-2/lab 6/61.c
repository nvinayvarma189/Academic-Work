#include<stdio.h>
int main()
{
	int a[10],l,i;
	printf("Enter the elements\n");
	for(i=0;i<10;i++)
	{
	    scanf(" %d",&a[i]);
	}
	l=a[0];
	for(i=1;i<10;i++)
	{
	    if (l>a[i])
		continue;
	    else
		 l=a[i];
	}
	printf("The largest element is %d\n",l);
	return 0;
}

#include<stdio.h>
int main()
{	
	int i,a[10],max,smax;
	printf("enter the elements\n");
	for(i=0;i<10;i++)		
		scanf("%d",&a[i]);
	max = a[0];
	for (i=0;i<10;i++)
	{
		if (a[i] > max)
		{
			smax = max;
			max = a[i];
		}
		else if (a[i] > smax)
		{
			smax = a[i];
		}
		else
		{
			int something = 0;
		}
	}
	printf("The second maximum value in the array is %d\n",smax);
	return 0;
}

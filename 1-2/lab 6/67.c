#include<stdio.h>
int main()
{
	int n,i,j,el,temp;
	printf("Enter size of array : \n");
	scanf("%d",&n);
	int a[n];
	i = 0;
	printf("enter the elements\n");
	while (i != n)
	{
		scanf("%d",&el);
		a[i] = el;
		i = i + 1;
	}
	i = 0;
	printf("Given array is \n");
	while (i != n)
	{
		printf("%d ",a[i]);
		i = i + 1;
	}
	printf("\n");
	i = 0;
	while (i != n - 1)
	{
		if (a[i] == 999)
		{
			i = i + 1;
			continue;
		}
		j = i + 1;
		while (j != n)
		{
			if (a[i] == a[j])
			{
				a[j] = 999;
			}
			j = j + 1;
		}
		i = i + 1;
	}
	printf("Output array is \n");
	i = 0;
	while (i != n)
	{
		if (a[i] == 999)
		{
			int something = 1;
		}
		else
		{
			printf("%d ",a[i]);
			
		}
		i = i + 1;
		
	}
	printf("\n");
	return 0;
}
	







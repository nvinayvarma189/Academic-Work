#include <stdio.h>
void read_array(int *array,int n)
{
	printf("Enter the array\n");
	for(int i=0;i<n;i++)
	scanf("%d",&array[i]);
}
void disp_array(int *array,int n)
{	printf("\nArray is:\t");
	for(int i=0;i<n;i++)
	printf("%d ",array[i]);
}
void find_small(int *array,int n,int *small,int *pos)
{
	*small=array[0];
	for(int i=0;i<n;i++)
	{
		if(*small>array[i])
		{
			*small=array[i];
			*pos=i;
		}
	}
}
int main()
{
	int n,small,pos;
	printf("Enter array size:\n");
	scanf("%d",&n);
	int array[n];
	read_array(array,n);
	disp_array(array,n);
	find_small(array,n,&small,&pos);
	printf("\n\nSmall:\t%d  Position:\t%d\n",small,pos+1);
	return 0;
}

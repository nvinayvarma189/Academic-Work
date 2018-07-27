#include<stdio.h>
void input(int *,int *,int *);
int main()
{
	int x,y,z;
	printf("input three numbers \n ");
	scanf("%d%d%d",&x,&y,&z);
	input(&x,&y,&z);
	return 0;
}
void input(int *small,int *medium,int *large)
{
	int t;
	if(*small>*medium)
	{
		t=*small;
		*small=*medium;
		*medium=t;
	}
	if(*small>*large)
	{
		t=*small;
		*small=*large;
		*large=t;
	}
	if(*medium>*large)
	{
		t=*medium;
		*medium=*large;
		*large=t;
	}
	printf("smallest = %d \n medium =%d \n largest=%d ",*small,*medium,*large);
}










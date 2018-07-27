#include<stdio.h>
int main()
{
	int x,*ip;
	ip=&x;
	printf("input a value for *ip : ");
	scanf("%d",&*ip);
	printf("%d \n",x);
	printf("let *ip = \n");
	scanf("%d",&*ip);
	printf("x = %d\n",x);
	printf("let x = \n");
	scanf("%d",&x);
	printf("*ip = %d \n",*ip);
	return 0;
}

#include<stdio.h>
main()
{
	int a=10;
	int * b;
	b= &a;
	printf(" \n a=%d\t b=%d\t *b=%d\n",a,&a,*b);
}

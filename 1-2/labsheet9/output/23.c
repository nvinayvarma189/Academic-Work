#include<stdio.h> 
int main()
{
	char *ptr = "Amrita";
	printf("%c\n", *&*&*ptr);
	return 0;
}

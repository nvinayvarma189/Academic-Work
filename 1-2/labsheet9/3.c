#include<stdio.h>
void charswap(char *,char *);
int main()
{
	char a,b;
	printf("input two char value 'a' and 'b' \n ");
	scanf("%c  %c",&a,&b);
	charswap(&a,&b);
	printf("a=%c b=%c ",a,b);
	return 0;
}
void charswap(char *cp1,char *cp2)
{
	char t;
	printf("swaping  char 'a' and 'b':");
	t=*cp1;
	*cp1=*cp2;
	*cp2=t;
	printf("\n a=%c \t b=%c",*cp1,*cp2);
}

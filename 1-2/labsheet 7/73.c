#include<stdio.h>
#include<string.h>
int main()
{
	int len,i,key;
	char c[100];
	printf("Enter the encrypted message\n");
	gets(c);
	len = strlen(c);
	key = c[len-1]-c[0];
	i = 0;
	while (i != len)
	{
		c[i] = c[i] + key;
		i = i + 1;
	}
	printf("Decrepted message is\n");
	puts(c);
	return 0;
}

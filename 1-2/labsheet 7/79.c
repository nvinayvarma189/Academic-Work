#include<stdio.h>
#include<string.h>
int main()
{
	int i,len,n;
	char data[100];
	printf("Enter a sentence\n");
	gets(data);
	len = strlen(data);
	n = 1;
	for (i=0;i<len;i++)
	{
		if (data[i] == ' ')
		{
			n = n + 1;
		}
	}
	printf("The number of words are %d\n",n);
	return 0;
}

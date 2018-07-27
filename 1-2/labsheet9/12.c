#include<stdio.h>
#include<string.h>
void stringcopy(const char *,char *);
int main()
{
	char s1[10],s2[10];
	printf("input source string:\n");
	gets(s1);
	printf("input dest string: \n");
	gets(s2);
	stringcopy(s1,s2);
	printf("source string=%s \n dest string=%s",s1,s2);
	return 0;
}
void stringcopy(const char *source,char *dest)
{
	int i;
	for(i=0;dest[i]!='\0';i++)
	{
		dest[i]=source[i];
	}
	dest[i]='\0';
}

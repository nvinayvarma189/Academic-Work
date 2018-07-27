#include<stdio.h>
#include<stdlib.h>
void main()
{
	char str[50];
	printf("Enter a string: ");
	gets(str);
	for(int i=0;str[i]!='\0';i++)
		str[i] = toupper(str[i]);
	puts(str);
}



/*OUTPUT:
Enter a string: asrv
ASRV  */
     

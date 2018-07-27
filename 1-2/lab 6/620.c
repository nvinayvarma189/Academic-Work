#include<stdio.h>
#include<string.h>
void main()
{	
	char ch1[50],ch2[50]=" ";
	int i;
	printf("Enter a string: ");
	scanf("%s",ch1);
	int len = strlen(ch1);
	for(i=0;i<len;i++)
		ch2[i] = ch1[i];	
	printf("The copied string is: %s\n",ch2);
	printf("The original string is: %s\n",ch1);
	
	ch2[50] = " ";
	strcpy(ch2,ch1);
	printf("\nThe contents of the duplicate string using the library function is: %s \n",ch2);
}
 

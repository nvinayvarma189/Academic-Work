#include<stdio.h>
#include<string.h>
void main()
{
	int len=0,i;
	char str[50];
	printf("Enter a string: ");
	scanf("%s",str);
	printf("The length of the string is: ");
	for(i=0;str[i]!='\0';i++)
		len++;
	printf("%d \n",len);
	printf("The length of the string using the library function is: %d\n",strlen(str));
}

	

/*OUTPUT:
Enter a string: asrv  
The length of the string is: 4 
The length of the string using the library function is: 4   */


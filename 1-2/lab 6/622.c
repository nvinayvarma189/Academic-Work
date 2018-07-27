#include<stdio.h>
#include<string.h>
void main()
{	
	int i,len1,len2,j;
	char str1[50],str2[50];
	printf("Enter string 1: ");
	gets(str1);
	printf("Enter string 2: ");
	gets(str2);
	len1 = strlen(str1);
	len2 = strlen(str2);
	for(i=len1,j=0;i<len2,j<len2;i++,j++)
		str1[i] = str2[j];
	str1[i]='\0';
	puts(str1);
}

		
/*OUTPUT:
Enter string 1: asrv
Enter string 2: rajeev
asrvrajeev    */
    

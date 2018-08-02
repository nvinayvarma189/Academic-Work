#include <stdio.h>
#include <string.h>
int main() 
{
	char str[100],str2[100];
	int ctr=0,len1,len2,max,i,k;
	fgets(str,100,stdin);
	str[strlen(str)-1]='\0';
	printf("string 2\n");
	fgets(str2,100,stdin);
	str2[strlen(str2)-1]='\0';
	len1=strlen(str);
	len2=strlen(str2);
	if(len2 > len1)
	 {
	  max = len2;
	  ctr= len2-len1;
	 }
	else {
	  max = len1;
	  ctr = len1 - len2;
	}
	printf("Enter k\n");
	scanf("%d",&k);
	for(i=0;i<max;i++)
	{
	 if(str[i] != str2[i])
	    ctr ++;
	}
	if ( ctr <= k)
	 printf("yes (actual k is %d)",ctr);
	else
	 printf("no (actual k is %d)",ctr);
	return 0;
}


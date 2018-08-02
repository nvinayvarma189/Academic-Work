#include <stdio.h>
#include <string.h>
int main() 
{
	int i=0;
	char str[100];
	fgets(str,100,stdin);
	str[strlen(str)-1]='\0';
	for(i=1;i<strlen(str);i++)
	{ 
	 if(str[i]==(str[i-1]+1))
	   { 
	   printf("%c",str[i-1]);
	   }
	else { 
	    if(str[i-1]==(str[i-2]+1))
	    { 
	     printf("%c\n",str[i-1]);
	    }
	   else {
	    printf("%c\n",str[i-1]);
	}
	} 
	}
	i=strlen(str)-1;
	if(str[i] == (str[i-1]+1))
	  printf("%c",str[i]);
	return 0;
}



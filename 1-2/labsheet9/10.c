#include<stdio.h>
#include<string.h>
int main()
{
	int n,i,cnt1=0,cnt2=0;
	char s[10];
	printf("input a string:");
	scanf("%s",s);
	for(i=0;s[i]!='\0';i++)
	{
		if((s[i]=='a')||(s[i]=='e')||(s[i]=='i')||(s[i]=='o')||(s[i]=='u'))
		{
			cnt1=cnt1+1;
		}
		else
		{
			cnt2=cnt2+1;
		}
	}
	printf("no. of consonants in string = %d ; no. of vowels in string = %d",cnt1,cnt2);
	return 0;
}
		

#include<stdio.h>
int pattern(int n ,int temp, int c);
int main()
{
	int n;
	printf("Enter a number: \n");
	scanf("%d",&n);
	printf("Output: \n");
	int temp = n;
	int c=0;
	pattern(n,temp,c);
}
int pattern(int n,int temp,int c)
{
	printf("%d",n);
	printf(" ");
	if(c==0)
	{
		if(n<=0)
		{
			c=1;
			n=n+5;
			pattern(n,temp,c);
		}
		else
		{
			n=n-5;
			pattern(n,temp,c);
		}
	}
	else
	{
		if(n!=temp)
		{
			n=n+5;
			pattern(n,temp,c);
		}
	}
}


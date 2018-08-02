#include<stdio.h>
int gcd(int,int);
int main()
{
 int a,b;
 printf("Enter a and b:");
 scanf("%d %d",&a,&b);
 int g=gcd(a,b);
 printf("%d",g);
 return 0;
}
int gcd(int x,int y)
{
 int rem=x%y;
 if(rem==0)
 return y;
 else
 return (gcd(y,rem));
}

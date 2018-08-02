#include<stdio.h>
int power(int,int);
int main()
{
 int a,b;
 printf("Enter base number:");
 scanf("%d",&a);
 printf("Enter power number(positive integer):");
 scanf("%d",&b);
 int c=power(a,b);
 printf("%d",c);
 return 0;
}
int power(int x,int y)
{
 int p=1;
 if(y==0)
 return p;
 else
 {
  y--;
  return(x*power(x,y));
 }
}

#include<stdio.h>
#include<math.h>
void dtb(int);
void btd(int);
int main()
{
 printf("\nChoose one of the following:");
 printf("\n1.Convert decimal to binary.");
 printf("\n2.Convert binary to decimal.");
 int n;
 scanf("%d",&n);
 switch(n)
 {
  case 1:
   printf("Enter the number:");
   int d;
   scanf("%d",&d);
   dtb(d);
   break;
  case 2:
   printf("enter the binary number:");
   int b;
   scanf("%d",&b);
   btd(b);
   break;
 }
 return 0;
}
void dtb(int x)
{
 int bin[100],c=0,i=0;
 while(x>0)
 {
  if(x%2==1)
  bin[c]=1;
  else
  bin[c]=0;
  x=x/2;
  c++;
 }
 for(i=c-1;i>=0;i--)
  printf("%d",bin[i]);
}
void btd(int y)
{
 int d=0,rem,i=0;
 while(y>0)
 {
  rem=y%10;
  d=d+rem*pow(2,i);
  y=y/10;
  i++;
 }
 printf("%d",d);
}

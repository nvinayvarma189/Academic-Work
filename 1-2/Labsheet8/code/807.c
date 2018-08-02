#include<stdio.h>
int pal(int);
int s=0;
int main()
{
 int x;
 printf("Enter the number:");
 scanf("%d",&x);
 int p=pal(x);
 if(p==x)
 printf("The number is a palindrome\n");
 else
 printf("Not a palindrome\n");
 return 0;
}
int pal(x)
{
 if(x>0)
 {
  int rem=x%10;
  s=s*10+rem;
  pal(x/10);
 }
 else
 return s;
}

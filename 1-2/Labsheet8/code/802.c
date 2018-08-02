#include<stdio.h>
int prime(int);
int main()
{
 int n,i,flag=0;
 printf("Enter a number:");
 scanf("%d",&n);
 for(i=2;i<=n/2;i++)
 {
  if(prime(i)==1)
  {
   if(prime(n-i)==1)
   {
    printf("\n %d = %d + %d\n",n,i,n-i);
    flag=1;
   }
  }
 }
 if(flag==0)
 printf("\nThe number cannot be expressed as sum of prime numbers\n");
 return 0;
}
int prime(int x)
{
 int i,flag=1;
 for(i=2;i<=x/2;i++)
 {
  if(x%i==0)
  {
   flag=0;
   break;
  }
 }
 return flag;
}
   

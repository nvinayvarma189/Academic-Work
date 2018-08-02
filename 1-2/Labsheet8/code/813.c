#include<stdio.h>
int largest(int[]);
int n;
int main()
{
 printf("Enter the size of the array:");
 scanf("%d",&n);
 printf("Enter the array:");
 int a[n],i;
 for(i=0;i<n;i++)
  scanf("%d",&a[i]);
 int c=largest(a);
 printf("%d",c);
 return 0;
}
int largest(int x[])
{
 static int i=0,max=-999;
 if(i<n)
 {
  if(max<x[i])
  max=x[i];
  i++;
  largest(x);
 }
 return max;
}

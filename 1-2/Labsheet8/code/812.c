#include<stdio.h>
void reverse(int[],int);
int main()
{
 int n,k;
 printf("Enter the size of the array:");
 scanf("%d",&n);
 int a[n];
 printf("Enter the array:");
 for(k=0;k<n;k++)
  scanf("%d",&a[k]);
 reverse(a,n);
 return 0;
}
void reverse(int x[],int s)
{
 int temp,i,j;
 for(i=0,j=s-1;i<s/2;i++,j--)
 {
  temp=x[i];
  x[i]=x[j];
  x[j]=temp;
 }
 for(i=0;i<s;i++)
  printf("%d ",x[i]);
}

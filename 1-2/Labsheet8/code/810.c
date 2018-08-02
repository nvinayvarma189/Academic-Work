#include<stdio.h>
void rotate(int[],int);
int main()
{
 int n,i;
 printf("Enter size of the array:");
 scanf("%d",&n);
 int a[n];
 printf("Enter the array:");
 for(i=0;i<n;i++)
  scanf("%d",&a[i]);
 rotate(a,n);
 return 0;
}
void rotate(int x[],int s)
{
 int j,temp;
 temp=x[0];
 for(j=0;j<s;j++)
 x[j]=x[j+1];
 x[s-1]=temp;
 for(j=0;j<s;j++)
  printf("%d ",x[j]);
}
 
 

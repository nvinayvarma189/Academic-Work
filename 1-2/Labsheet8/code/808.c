#include<stdio.h>
int bs(int[],int,int,int,int);
int main()
{
 int n,i,e;
 printf("Enter the size:");
 scanf("%d",&n);
 int a[n];
 printf("Enter the elements of the array:");
 for(i=0;i<n;i++)
  scanf("%d",&a[i]);
 printf("Enter the element to be searched:");
 scanf("%d",&e);
 int l=0,u=n-1;
 int f=bs(a,n,e,l,u);
 if(f==0)
 printf("The number is not found.");
 else
 printf("The number is found.");
 return 0;
}
int bs(int x[],int y,int z,int l1,int u1)
{
 int mid,c=0;
 if(l1<=u1)
 {
  mid=(l1+u1)/2;
  if(z==x[mid])
  c=1;
  else if(z<x[mid])
  return(x,y,z,l1,mid-1);
  else
  return(x,y,z,mid+1,u1);
 }
}
   

#include<stdio.h>
void Read_array();
void Inc_even();
void Display_array();
int marks[5][4];
int main()
{
 Read_array();
 Inc_even();
 Display_array();
 return 0;
}
void Read_array()
{
 int i,j;
 printf("Enter the elements of the array:");
 for(i=0;i<5;i++)
  for(j=0;j<4;j++)
   scanf("%d",&marks[i][j]);
 }
void Inc_even()
{
 int i,j;
 for(i=0;i<5;i++)
  for(j=0;j<4;j++)
  {
   if((i+1)%2!=0 && (j+1)%2==0)
   marks[i][j]=marks[i][j]+1;
  }
}
void Display_array()
{
 int i,j;
 for(i=0;i<5;i++)
 {
  printf("\n"); 
  for(j=0;j<4;j++)
   printf("%d ",marks[i][j]);
 }
}
   

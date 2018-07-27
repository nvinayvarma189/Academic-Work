#include<stdio.h>
int main()
{
 char s1[50],s2[50];
 printf("Enter the first string:");
 scanf("%s",s1);
 printf("Enter the second string:");
 scanf("%s",s2);
 int i,j,flag=0;
 for(i=0,j=0;s1[i]!='\0',s2[j]!='\0';i++,j++)
 {
  if(s1[i]!=s2[j])
  flag=1;
  break;
 }
 if(flag==0)
  printf("The strings are same.");
 else
  printf("The strings are not the same.");
 return 0;
}

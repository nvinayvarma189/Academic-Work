#include<stdio.h>
int main()
{
 char s[50];
 printf("Enter the string:");
 scanf("%s",s);
 int i,size,flag=0;
 for(i=0;s[i]!='\0';i++);
 size=i;
 for(i=0;i<size;i++)
 {
  if(s[i]!=s[size-i-1])
  flag=1;
  break;
 }
 if(flag==0)
  printf("The given string is a palindrome.\n");
 else
  printf("The given string is not a palindrome.\n");
 return 0;
}

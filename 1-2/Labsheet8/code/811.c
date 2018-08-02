#include<stdio.h>
#include<string.h>
void word(char[]);
int main()
{
 int i;
 char s[50];
 printf("Enter the string:");
 gets(s);
 puts(s);
 word(s);
 return 0;
}
void word(char c[])
{
 int j,w=0;
 for(j=0;c[j]!='\0';j++)
 {
  if(c[j]==' ')
  w++;
 }
 printf("No of words:%d",w+1);
}

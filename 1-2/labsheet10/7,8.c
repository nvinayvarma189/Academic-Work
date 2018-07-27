#include<stdio.h>
int main()
{
FILE *fo,*fs;
char c,c1;
fo=fopen("character.txt","w");
scanf("%c",&c);
while(c!='\n')
{
fputc(c,fo);
scanf("%c",&c);
}
fclose(fo);
fo=fopen("character.txt","r");
c1=getc(fo);
while(c1!=EOF)
{
printf("%c",c1);
c1=getc(fo);
}
fo=fopen("character.txt","r");
fs=fopen("character2.txt","w");
c1=getc(fo);
while(c1!=EOF)
{
fputc(c1,fs);
c1=getc(fo);
}
fclose(fo);
fo=fopen("character.txt","w+");
while(fscanf(fo,"%c",c1)!=EOF)
fprintf(fs,"%c",c1);
fclose(fs);
return 0;
}

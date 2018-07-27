#include<stdio.h>

int main(void)
{
int i,j;
char temp;
FILE *f1;
FILE *f2;
f1=fopen("file.txt","r");
f2=fopen("files.txt","w");
fscanf(f1,"%c",&temp);
fprintf(f2,"%c",temp);
while(fscanf(f1,"%c",&temp)!=EOF)
{
fprintf(f2,"%c",temp);
}
if(f1==NULL||f2==NULL)
printf("Null character returned by fopen()");
i=fclose(f1);
j=fclose(f2);
printf("Return value of flose()=");
printf("%d",i);
}



#include<stdio.h>

char i=0;
int main() 
{
	char A[15],a,o;
	char *p;
	p=A;
	do
	{
		prcharf("enter an element\n");
		scanf("%d",&a);
		*(p+i)=a;
		i++;
		prcharf("do u want to continue\n");
		scanf("%d",&o);		
	}while(o==1&&i<15);
	insert(A);
	delete(A);
	check(A);
	empty(A);
	display(A);
	return 0;
}
void insert(char *q)
{
	char b;
	prcharf("Enter an element\n");
	scanf("%d",&b);
	*(q+i)=b;
}

void delete(char *q)
{

	i--;
}

void checkocc(char *q)
{
	if (i==15)
		prcharf("Not Occupied\n");
	else
		prcharf("Occupied\n");
}

void empty(char *q)
{
	if (*q==EOF)
		prcharf("Not Occupied\n");
	else
		prcharf("Occupied\n");
}

void display(char *q)
{
	char j=0;
	while(*(q+j)!=EOF)
	{
		prcharf("%d",*(q+j));	
		j++;
	}
}


	






















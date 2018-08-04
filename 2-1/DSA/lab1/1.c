#include<stdio.h>
int insert(int *,int,int);
int delete(int *,int n);
int check(int *);
int check1(int *);
int display(int *,int );
int main()
{
	int a[15],i,j,n,e,*p;
	p=a;
	printf("Enter number of elements needed\n");
	scanf("%d",&n);
	printf("Enter array elements\n");
	for (i=0;i<n;i++)
		scanf("%d",(p+i));
	printf("Enter element to insert\n");
	scanf("%d",&e);
	insert(p,e,n);
	delete(p,n);
	check(p);
	check1(p);
	display(p,n);
	return 0;
}
int insert(int *p,int e,int n)
{
	int i;
	*(p+n)=e;
	printf("Elements after inserting\n");
	for (i=0;i<=n;i++)
		printf("%d\n",*(p+i));
}
int delete(int *p,int n)
{
	int i;
	*(p+i)='\0';
	printf("Elements after deleting the inserted element\n");
	for (i=0;i<=n-1;i++)
		printf("%d\n",*(p+i));
}
int check(int *p)
{
	int c=0,i;
	for (i=0;i<15;i++)
	{
		if (*(p+i)=='\0')
			c++;
	}
	if(c>1)
		printf("The array is not completely filled\n");
	else
		printf("The array is completely filled\n");
}
int check1(int *p)
{
	int c=0,i;
	for (i=0;i<15;i++)
	{
		if (*(p+i)!='\0')
		{ 	c=1;
			break;
		}
	}
	if (c==1)
		printf("The array is not empty\n");
	else
		printf("The array is empty\n");
}
int display(int *p,int n)
{
	int i;
	printf("The contents of the array are\n");
	for(i=0;i<n;i++)
		printf("%d\n",*(p+i));
}

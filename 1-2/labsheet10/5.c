#include<stdio.h>
struct date_admit
{
	int dd;
	int mm;
	int yy;
};
int n;
struct Patient
{
	int ipno;
	char name[100];
	struct date_admit da;
};
struct date_admit i,o;
void display(struct Patient[], struct date_admit d1, struct date_admit d2);
struct Patient read();
int main()
{
	printf("Enter the number of patients:\n");
	scanf("%d",&n);
	struct Patient p[n];
	for(int i=0;i<n;i++)
	{
		printf("Welcome Patient %d :\n",(i+1));
		p[i]=read();
	}
	printf("Enter dates to be checked:\n");
	printf("In - Date:\n");
	printf("dd:\t");
	scanf("%d",&i.dd);
	printf("mm:\t");
	scanf("%d",&i.mm);
	printf("yyyy:\t");
	scanf("%d",&i.yy);
	printf("Out - Date:\n");
	printf("dd:\t");
	scanf("%d",&i.dd);
	printf("mm:\t");
	scanf("%d",&i.mm);
	printf("yyyy:\t");
	scanf("%d",&i.yy);
	display(p,i,o);
	
}
struct Patient read()
{
	struct Patient e;
	printf("Enter name:\n");
	scanf("%s",e.name);
	printf("Enter ipno:\n");
	scanf("%d",&e.ipno);
	printf("Enter date of admit:\n");
	printf("dd:\t");
	scanf("%d",&e.da.dd);
	printf("mm:\t");
	scanf("%d",&e.da.mm);
	printf("yyyy:\t");
	scanf("%d",&e.da.yy);
	return e;
}
void display(struct Patient q[], struct date_admit in,struct date_admit out)
{
	for(int i=0;i<n;i++)
	{
		{
			printf("\nIP No:\t%d\n",q[i].ipno);
			printf("Name:\t\t%s\n",q[i].name);
			printf("Date Of Admit:\t%d/%d/%d\n",q[i].da.dd,q[i].da.mm,q[i].da.yy);
		}
	}
}


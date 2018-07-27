#include<stdio.h>
struct Employee
{
	int emp_no;
	char name[100];
	char pos;
	float basic;
};
struct Employee read();
void disp(struct Employee);
void search(struct Employee[],char);
int n;

int main()
{
	printf("Enter the number of employees:\n");
	scanf("%d",&n);
	struct Employee cust[n];
	for(int i=0;i<n;i++)
	{
		printf("Welcome Employee %d :\n",(i+1));
		cust[i]=read();
	}
	printf("Enter position to be searched for:\n");
	char k;
	scanf(" %c",&k);
	search(cust,k);
	printf("\n\nDetails of all employees:\n");
	for(int i=0;i<n;i++)
		disp(cust[i]);
}
struct Employee read()
{
	struct Employee e;
	printf("Enter name:\n");
	scanf("%s",e.name);
	printf("Enter employee number:\n");
	scanf("%d",&e.emp_no);
	printf("Enter position(Manager(M),Supervisor(S),Ordinary(O)):\n");
	scanf(" %c",&e.pos);
	printf("Enter basic pay:\n");
	scanf("%f",&e.basic);
	printf("\n");
	return e;
}
void search(struct Employee ee[], char ch)
{
	for(int i=0;i<n;i++)
	{
		if(ee[i].pos==ch)
			disp(ee[i]);
	}
}
void disp(struct Employee q)
{
	printf("\nEmployee No:\t%d\n",q.emp_no);
	printf("Name:\t\t%s\n",q.name);
	printf("Basic Pay:\t%.2f\n",q.basic);
	printf("Position:\t%s\n",(q.pos=='S')?"Supervisor":(q.pos=='O')?"Ordinary":"Manager");
	return;
}

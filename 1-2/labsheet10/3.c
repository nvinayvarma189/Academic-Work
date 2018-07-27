#include<stdio.h>
struct Bank
{
	int acc_no;
	char name[100];
	char type_acc;
	float balance;
};
void search(struct Bank[] ,int);
int n;
void disp(struct Bank);
int main()
{
	printf("Enter the number of customers:\n");
	scanf("%d",&n);
	struct Bank cust[n];
	for(int i=0;i<n;i++)
	{
		printf("Welcome Customer %d :\n",(i+1));
		printf("Enter name:\n");
		scanf("%s",cust[i].name);
		printf("Enter account number:\n");
		scanf("%d",&cust[i].acc_no);
		printf("Enter account type (Savings - S / Current - C):\n");
		scanf(" %c",&cust[i].type_acc);
		printf("Enter balance:\n");
		scanf("%f",&cust[i].balance);
		printf("\n");
	}
	printf("Enter account number to be searched for:\n");
	int k;
	scanf("%d",&k);
	search(cust,k);
	for(int i=0;i<n;i++)
		disp(cust[i]);
}
void search(struct Bank cus[],int l)
{
	int flag=0;
	for(int i=0;i<n;i++)
	{
		if(cus[i].acc_no==l)
		{
			flag=i+1;
			break;
		}
	}
	if(flag==0)
		return;
	else
		disp(cus[flag-1]);
}
void disp(struct Bank q)
{
	printf("\nAccount No:\t%d\n",q.acc_no);
	printf("Name:\t\t%s\n",q.name);
	printf("Balance:\t%.2f\n",q.balance);
	printf("Account type:\t%s\n",(q.type_acc=='S')?"Savings":"Current");
	return;
}

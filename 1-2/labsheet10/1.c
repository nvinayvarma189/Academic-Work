#include<stdio.h>
struct Std
{
	int roll_no;
	char name[100];
	float avg_mark;
};
void print(struct Std[]);
int main()
{
	struct Std B[5];
	for(int i=0;i<2;i++)
	{
		printf("Enter roll number:\n");
		scanf("%d",&B[i].roll_no);
		printf("Enter the name of the student:\n");
		scanf("%s",B[i].name);
		printf("Enter the avg mark of the student:\n");
		scanf("%f",&B[i].avg_mark);
	}
	print(B);
	return 0;
}
void print(struct Std q[])
{
	for(int i=0;i<2;i++)
	{
		printf("\nRoll No:\t%d\n",q[i].roll_no);
		printf("Name:\t\t%s\n",q[i].name);
		printf("Avg Mark:\t%.2f\n",q[i].avg_mark);
	}
}


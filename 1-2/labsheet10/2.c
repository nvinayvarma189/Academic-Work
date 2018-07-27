#include<stdio.h>
struct Book
{
	int book_id;
	char book_title[100];
	char author[100];
	float price;
};
void print(struct Book);
int main()
{
	struct Book B;
	printf("Enter Book ID:\n");
	scanf("%d",&B.book_id);
	printf("Enter the title of the book:\n");
	scanf("%s",B.book_title);
	printf("Enter the name of the author:\n");
	scanf("%s",B.author);
	printf("Enter the price of the book:\n");
	scanf("%f",&B.price);
	print(B);
	return 0;
}
void print(struct Book B1)
{
	printf("\n\n%d\n%s By %s\nRs.%.2f.\n",B1.book_id,B1.book_title,B1.author,B1.price);
}

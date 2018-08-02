#include<stdio.h>
int main()
{
	int d=0,a[10][10],i,j,r,c;
	printf("Enter the number of rows\n");
	scanf("%d",&r);
	printf("Enter the number of columns\n");
	scanf("%d",&c);
	printf("Enter the array elements\n");
	if ( r%2 != 0 && c%2 != 0 && r==c)
	{
           for (i=0;i<r;i++)
	   {
	       for (j=0;j<c;j++)
		    scanf("%d",&a[i][j]);
	   }
	   printf("Middle row is:");
	   for(i=1,j=0;j<c;j++)
               printf("%d",a[i][j]);
	   printf("\n");
	   printf("Middle column is:");
	   for(i=0,j=1;i<r;i++)
               printf("%d",a[i][j]);
	   printf("\n");
	   d=1;
	}
        if (d==0)
	   printf("It is invalid.Please enter a square matrix of odd integer\n");
}	

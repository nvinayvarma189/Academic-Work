#include<stdio.h>
int main()
{
	int a[10][10],b[10][10],c[10][10],i,j,k,r1,r2,c1,c2;
	printf("Enter the number of rows and columns in first matrix\n");
	scanf("%d%d",&r1,&c1);
	printf("Enter the number of rows and columns in second matrix\n");
	scanf("%d%d",&r2,&c2);
	if (c1==r2)
	{
	  printf("Enter the elemets of the first matrix\n");
	  for (i=0;i<r1;i++)
	  {
              for (j=0;j<c1;j++)	     
                   scanf("%d",&a[i][j]);
	  }
	  printf("Enter the elemets of the second matrix\n");
	  for (i=0;i<r2;i++)
	  {
              for (j=0;j<c2;j++)	     
                   scanf("%d",&b[i][j]);
	  }
	   for (i=0;i<r1;i++)
	   {
		for (j=0;j<c2;j++)
	        {
		     c[i][j]=0;
		     for (k=0;k<c1;k++)
		          c[i][j] += a[i][k]*b[k][j];
		}
	   }
	   printf("The multiplied matrix is\n"); 
	   for (i=0;i<r1;i++)
	   {
		for (j=0;j<c2;j++)
	             printf("%d ",c[i][j]);
           }
	}
	else 
	      printf("Matrix multiplication is not possible\n");
	return 0;
}		

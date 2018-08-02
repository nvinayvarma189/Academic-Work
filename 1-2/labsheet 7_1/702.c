#include<math.h>
#include<stdio.h>
int main()
{
	int i,j,mat[3][3],det=0;
	for(i=0;i < 3;i++)
	{
		for(j=0;j<3;j++)
		{
			scanf("%d",&mat[i][j]);
		}
	}
	for(i=0;i<3;i++)
      det=det+(mat[0][i]*(mat[1][(i+1)%3]*mat[2][(i+2)%3]-mat[1][(i+2)%3]*mat[2][(i+1)%3]));
      
	printf("\nDeterminant of matrix is: %d\n",det);
   return 0;
}


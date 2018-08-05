import java.util.Scanner;
class Matrix
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a 3/3 matrix\n");
		int[][] a =new int[3][3];
		int[][] b =new int[3][3];
		int i,j,r=0,c=0;
		for (i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				a[i][j]= s.nextInt();
			}
		} 
		System.out.println("The transpose of the matrix is\n");
		for (i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		for (i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				System.out.print(b[i][j]);
			}System.out.println();
		}System.out.println();
		for (i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				if(b[i][j]==a[i][j])
				{
					r=1;
					c=1;
				}
				else
						r=c=0;
						break;
					
			}
			
		}
		if(r==1 && c==1)
			{
				System.out.println("The eneterd matrix is symmetric");
			}
			else
				System.out.println("The eneterd matrix is not symmetric");
	}
}
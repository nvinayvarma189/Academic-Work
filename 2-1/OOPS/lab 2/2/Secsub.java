import java.util.Scanner;

class Secsub{
public  void second(){

Scanner s=new Scanner(System.in);
int n,i,j,k=0;
System.out.println("input no of elements");
n=s.nextInt();
int [][]a=new int [n][n];
int [][]b=new int [n][n];
System.out.println("start entering the matrix");
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		a[i][j]=s.nextInt();
	}
}

for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		b[j][i]=a[i][j];
	}
}
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		if(b[i][j]==a[i][j])
		{
			k=k+1;
		}
	
		
	}
}
	System.out.println(k);
	if(k==n*n)
		{
			System.out.println("a is a symmetric matrix");
		}
	else	{

			System.out.println("a is a not Symmetric matrix");
		}
}
}




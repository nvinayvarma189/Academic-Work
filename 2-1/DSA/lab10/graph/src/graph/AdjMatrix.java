package graph;

public class AdjMatrix 
{
	int[][] a= new int [50][50]; 
	int i,j;
	int r=5,c=5,cnt1=-1,cnt2=0;
	AdjMatrix(int v)
	{
		int r=v;
		int c=v;
		
		a=new int [v+1][v+1];
	}
	public void board()
	{
		for (i=0;i<(r+1);i++)
		{
			for (j=0;j<(c+1);j++)
			{
				if (i==0)
				{
					cnt1++;
					a[i][j]=cnt1;
				}
				else if (j==0)
				{
					cnt2++;
					a[i][j]=cnt2;
				}
				else 
				{
					a[i][j]=0;
				}
			}
		}
	}
	
	public void print()
	{
		for (i=0;i<=r;i++)
		{
			for (j=0;j<=c;j++)
			{
				System.out.print(+a[i][j]+" ");
			}
			System.out.println (" ");
		}
			
	}
	
	public void update(int e)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				int flag=0;
				for(int k=1;k<=e;k++)
				{
					if((i==x[k])&&(j==y[k])){
						System.out.print("1 ");
						flag=-1;
						break;
					}
				}
				if(flag==0){
				System.out.print("0 ");
				}
			}

	}
	}
	public void addEdges(int e)
	{
		System.out.println("Enter the edges");
		for (int i=0;i<e;i++)
		{
			int x= s.nextInt();
			int y=s.nextInt();
		}
	}
	
	
	
}

import java.util.Scanner;

	class Sumarray
	{

		public static void main(String args[]){
		Scanner s=new Scanner(System.in);
			int n,i,j=0;
			int[] a=new int[50];
			System.out.println("enter size of array");
			n=s.nextInt();
			for(i=0;i<n;i++)
			{	
				a[i]=s.nextInt();
				j+=a[i];
			}
			System.out.println("sum of array elements is"+j);
		}
	}
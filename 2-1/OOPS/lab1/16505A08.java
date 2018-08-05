/* File Name:SumAvg.java
	Roll no. u4cse16508
	Name:Venu
	Submitted on:12/7/17
*/
import java.util.Scanner;

class CSE16508A08
	{

		public static void main(String args[])
		{
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
			float avg=(j/n)
			System.out.println("Sum Average = "+avg);
		}
	}
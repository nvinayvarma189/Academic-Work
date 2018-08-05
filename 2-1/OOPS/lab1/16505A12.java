import java.util.Scanner;
class Multiply
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int a,i,m;
		a=s.nextInt();
		System.out.println("Enter a number to get its multiplication table");
		for (i=0;i<=20;i++)
		{
			m=a * i;
			System.out.println(a+"X"+i+"="+m);
		}
	}
}
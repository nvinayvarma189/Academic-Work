import java.util.Scanner;
class Amicable
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a,b,i,s1,s2;
		System.out.println("Enter two numbers");	
		a=s.nextInt();
		b=s.nextInt();
		s1=s2=0;
		for(i=1;i<b;i++)
		{
			if(b%i == 0)
			{
				s1+=i;
			}
		}
		for(i=1;i<a;i++)
		{
			if(a%i == 0)
			{
				s2+=i;
			}
		}
		if (s1==a && s2==b)
			System.out.println("The entered numbers are Amicable numbers");
		else
			System.out.println("The entered numbers are not Amicable numbers");
	}
}
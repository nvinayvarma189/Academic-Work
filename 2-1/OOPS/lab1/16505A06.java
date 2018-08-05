import java.util.Scanner;
class SumTwo
{
	public static void main(String args[])
	{
		System.out.println("Input two numbers");
		Scanner s = new Scanner(System.in);
		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("The sum of the two inputed numbers is "+(a+b));
	}

}
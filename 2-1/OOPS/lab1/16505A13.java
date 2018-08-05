import java.util.Scanner;

	class Third
	{
		public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n,i,j=0,c=0,p;
		n=s.nextInt();
		p=n;
		while(p>0)
		{
			i=p%10;
			j=j*10+i;
			p=p/10;
		}
		if(j!=n)
		{
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c=c+1;
				}	
			}
			if(c<=2)
			{
				emirps(n);
			}
				
		}
		else
		{
			System.out.println("not applicable for palindromes");
		}
	}
		public static void emirps(int a){
			int s,m=0,b,e=0,d;
			d=a;
			while(a>0)
			{
				s=a%10;
				m=m*10+s;
				a=a/10;	
			}
			for(b=1;b<=d;b++)
			{
				if(d%b==0)
				{
					e=e+1;
				}	
			}
			if(e<=2)
			{
				System.out.println("the reverse of"+d +"is"+m +"also a prime");
			}
				
		}
		
	}
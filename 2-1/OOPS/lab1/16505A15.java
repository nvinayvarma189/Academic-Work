import java.util.Scanner;

	class five
	{
		public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int i,j,k;
		double n,p,avgspeed,avgtime;
		System.out.println("input kilometers");
		n=s.nextInt();
		System.out.println("time in secomds");
		k=s.nextInt();
		p=n*1.61;
		j=k;
		avgspeed=p/k;
		avgspeed=avgspeed*3600;
		avgtime=j/p;
		System.out.println("avgspeed="+avgspeed+" per hour");
		System.out.println("avgtime="+avgtime+" in seconds");
	}
}
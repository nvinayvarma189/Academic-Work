import java.util.Scanner;
			class Two{
			public static void main(String [] args)
		{
			int i,j,k;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the strength of class");
			int n=s.nextInt();
			String[] name=new String [n];
			int[] rn=new int [n];
			int[] p1=new int [n];
			int[] p2=new int [n];
			for(i=0;i<n;i++){
			System.out.println("roll number");
			rn[i]=s.nextInt();
			System.out.println("student name");
			name[i]=s.next();
			System.out.println("first periodical marks");
			p1[i]=s.nextInt();
			System.out.println("second periodical marks");
			p2[i]=s.nextInt();
					}
			System.out.println("no     name            p1     p2");
			for(i=0;i<n;i++){
			System.out.println(rn[i]+"     "+name[i]+"       ss     "+p1[i]+"     "+p2[i]);
					}
		}
}


import java.util.Scanner;
import java.io.File;
import java.util.Formatter;
	class Text{
		public static void main(String [] args){
			int i,j,k;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the strength of class");
			int n=s.nextInt();
			try{
				Formatter f= new Formatter("Data.txt");
				for(i=0;i<n;i++){
				System.out.println("enter  roll number");
				f.format("%d      ",s.nextInt());
				System.out.println("enter students names");
				f.format("%s      ",s.next());
				System.out.println("enter first periodical marks");
				f.format("%d       ",s.nextInt());
				System.out.println("enter second periodical marks");
				f.format("%d\n",s.nextInt());
				}
			f.close();
			}
			catch(Exception e){
			System.out.println("error");
				}
		}
}


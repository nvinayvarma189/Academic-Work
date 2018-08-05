import java.util.Scanner;
import java.io.File;
class FilePrint{

		public static void main(String args[])
	{
		int i=0,c=0;
		String [] a = new String[100];
		File x = new File("Firs.java");
		try
		{
			Scanner s = new Scanner(x);
			while(s.hasNext())
			{
				a[i]=s.nextLine();	
				i++;
				c++;
			} 
			s.close();

		}catch(Exception e){
			System.out.println("there is an error");
			}
		
		for(i=c-1;i>=0;i--)
		{
			System.out.println(a[i]);		
		
		}
		

	}
}

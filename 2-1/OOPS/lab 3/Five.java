import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
class Mtech{
		public static void main(String [] args){
			String []a=new String[100];
			Scanner w=new Scanner(System.in);
			int i=0,c=0,l,h;
			String b; 
			System.out.println("enter no of stop words"); 
			h=w.nextInt();
			String [] d=new String[h];
			System.out.println("enter "+h+" stop characters");
			for(l=0;l<h;l++){
			d[l]=w.next();
			}
			try{
				File f=new File("text.txt");
				Scanner s=new Scanner(f);
				while(s.hasNext()){
				a[i]=s.next();
				c=c+1;
				i=i+1;
			}
			for(i=0;i<c;i++){
			b=a[i];
			for(l=0;l<h;l++){
			if(b.equals(d[l])){
				a[i]=" ";
				continue;
			}
		}
	
		}
	s.close();
}
	catch(Exception e){
	System.out.println("error");
	}
	for(i=0;i<c;i++){
	System.out.print(a[i]);
	System.out.print(" ");
	}
}
}

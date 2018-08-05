import java.io.*;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

class Four{
		public static void main(String [] args){
			int i=0,j=0,k,c=0,n=0;
			String [] q=new String[100];
			char x;
			try{
			File f=new File("Text.txt");
 			Scanner s=new Scanner(f); 
			while (s.hasNext()){
				q[i]=s.next();
				i++;
				c++;
			}
			System.out.println(c);
			int [] w= new int [c];
			for(i=0;i<c;i++){
				w[i]=q[i].length();
			}
			for(i=0;i<c;i++){
				int l=0;
				for(j=0;j<w[i];j++)
			{
				x=q[i].charAt(l);
				l++;
				System.out.println(x);
				if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
				n=n+1;
				}
			}
	}
	System.out.println("no of vowels are "+n);
	s.close();
	}catch(Exception e){
		System.out.println("error found");
	}
}
}

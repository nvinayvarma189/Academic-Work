import java.util.Scanner;

class Third 
{
	public static void main(String [] args){
	String str;
	Scanner s=new Scanner(System.in);
	str=s.nextLine();
	Sub f=new Sub();
	int i;
	int k =0;
	char []ch=new char[25];
	ch[k]='(';
	for(i=0,k=1;i<str.length();i++,k++)
	{
		ch[k]=str.charAt(i);
	}
	ch[k]=')';
	for( i=0;i<=str.length()+1;i++)
	{
		System.out.print(ch[i]);
	}
	
	for(i=0;i<=str.length()+1;i++){
		f.push(ch[i]);
	}
	f.print();
}
}


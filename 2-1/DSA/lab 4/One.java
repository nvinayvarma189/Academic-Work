import java.util.Scanner;
class First{
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String  st;
	FirstSub f=new FirstSub();
	String []str=new String[14];
	String []l=new String[6];
	l[0]="{";
	l[1]="[";
	l[2]="(";
	l[3]=")";
	l[4]="]";
	l[5]="}";
	
	int i=0,c=0,k=0;
	st=s.nextLine();
	Scanner sp=new Scanner(st);
	System.out.println(st);
	while(sp.hasNext()){
	str[i]=sp.next();
	i++;
	c++;
	}
	for(i=0;i<c;i++){
		if((str[i].equals(l[0]))||(str[i].equals(l[1]))||(str[i].equals(l[2])))
		{

			f.push(str[i]);

		}
		else {
		f.pop(str[i]);
		}
	}
f.check(c);
	}
	}
			



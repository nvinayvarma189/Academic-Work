import java.util.Scanner;

class Sub{

 
public static void main(String [] args){
String str;
Mainsub f=new Mainsub();
String []st=new String [20]; 
char [] c=new char [20];
int [] r=new int [10];
int q=0;
	char []l=new char[5];
	l[0]='+';
	l[1]='-';
	l[2]='*';
	l[3]='/';
	l[4]='^';
int i=0,h=0;
Scanner s=new Scanner(System.in);
str=s.nextLine();
System.out.println(str);
//Scanner sp=new Scanner();
h=str.length();

for(i=0;i<h;i++){
c[i]=str.charAt(i);
}
c[i]=' ';
c[i+1]=')';
for(i=0;i<=h+1;i++){
	System.out.print(c[i]);
}
System.out.println(" ");
System.out.print("the answer is  ");
for(i=0;i<=h+1;i++){
	if(c[i]==')'){
			f.top();
		}
	else if((c[i]=='+')||(c[i]=='-')||(c[i]=='*')||(c[i]=='/')||(c[i]=='^')){
		f.pop(c[i]);
		
	}
	else {
	if(c[i]!=' ')
		f.push(c[i]);
		
	     }
	}
		
			
}
}


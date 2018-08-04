import java.util.Scanner;
class Mainsub{
char []s=new char[25];
	int [] a=new int [10];
int top=-1;

public void push(char e){
	top=top+1;
	s[top]=e;
	//System.out.println(s[top]);
	}
public  void pop(char e){
		char i=s[top];
	top=top-1;
	char j=s[top];
	int k=(int)i;
	int g=(int)j;
	
	k=k-48;
	g=g-48;
	if(e=='+'){
		g=g+k;
	}
	else if(e=='-'){
		g=g-k;
	}
	else if(e=='*'){
		g=g*k;
	}
	else if(e=='/'){
		g=g/k;
	}
	else if(e=='^'){
		g=g^k;
	}
	g=g+48;
	s[top]=(char)g;
	
	
	
}
	public void top(){
		
		System.out.println((int)s[top]-48);
		
		
		}
}


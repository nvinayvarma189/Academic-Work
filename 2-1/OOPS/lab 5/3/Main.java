/*
N.Vinay Varma
AM.EN.U4CSE16505
CSE C*/
import java.util.Scanner;
class Myexception{
	Myexception(String msg){
		System.out.println(msg);
	}
}
	
class Main{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int f;
	int c=0,sum=0;
	int g;
	System.out.println("press -1 to discontinue and any other integer to continue");
	f=s.nextInt();
	while(f!=-1){	
	c=c+1;
	sum=sum+f;
	System.out.println("press -1 to discontinue and any other integer to continue");
	f=s.nextInt();
	}
	if(c<5){
	try{
		System.out.println(100/0);
	}catch(Exception e){
	Myexception m=new Myexception("check argument");
	}
	}
	else{
	System.out.println("The sum is "+sum);
	}
}
}


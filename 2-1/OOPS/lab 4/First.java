
import java.util.Scanner;
class First{
	String modelname;
	int modelnumber;
	int modelprice;
	First(){
	 modelname="BMW";
	 modelnumber=1;
	 modelprice=10000;
	}
	public void display(){
	System.out.println("modelname="+modelname);
	System.out.println("modelnumber="+modelnumber);
	System.out.println("modelprice="+modelprice);
	}
}

class Car extends First{
int discoun=2500;
public void display(){
	System.out.println("modelname="+modelname);
	System.out.println("modelnumber="+modelnumber);
	System.out.println("modelprice="+modelprice);
	System.out.println("discount="+discoun);
}
public void discount(){
	int k=modelprice-discoun;
	System.out.println("final rate="+k);
	}
}

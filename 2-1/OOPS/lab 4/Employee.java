class Employee{
String name="vinay";
String address="andhra pradesh";
int age=20;
String gender="male";
public void display(){
	System.out.println(" name="+name);
	System.out.println("Address="+address);
	System.out.println(" age="+age);
	System.out.println("gender="+gender);
}
}
class Fulltimeemployee extends Employee{
int salary=5000;
String designation=".......";
public void display(){
	System.out.println(" name="+name);
	System.out.println("Address="+address);
	System.out.println(" age="+age);
	System.out.println("gender="+gender);
	System.out.println("salary="+salary);
	System.out.println("designation="+designation);
}
}
class Parttimeemployee extends Employee{

int workinghours=15;
int rateperhour=100;
int pay;
public void pay(){
pay=workinghours*rateperhour;
	}
public void display(){
	System.out.println(" name="+name);
	System.out.println("Address="+address);
	System.out.println(" age="+age);
	System.out.println("gender="+gender);
	System.out.println("workinghours="+workinghours);
	System.out.println(" rateperhour="+  rateperhour);
	System.out.println("pay="+pay);
}
}

class Main{
public static void main(String [] args){
Employee c=new Employee();
c.display();
System.out.println();
Fulltimeemployee d=new Fulltimeemployee();
d.display();
System.out.println();
Parttimeemployee f =new Parttimeemployee();
f.pay();
f.display();
}
}

abstract class Account{
	int balance;
int accountnumber;
String ownername;
String address;
Account(){
 balance=50000;
 accountnumber=47683;
 ownername="vinay";
 address="andhra pradesh";
}
abstract public void withdrawl();
abstract public void deposit();
public void display(){
System.out.println("balance="+balance);
System.out.println("accountnumber="+accountnumber);
System.out.println("ownername="+ownername);
System.out.println("address="+address);
}
}
 class Savings extends Account{
int rateofintrest=10;
 public void deposit()
{
	balance=balance+10000;
}
public void withdrawl(){
	balance=balance-10000;
	}
public void amount(){
	balance=balance+5000;
	}
public void dispaly(){
System.out.println("balance="+balance);
System.out.println("rate of intrest=10");
System.out.println("accountnumber="+accountnumber);
System.out.println("ownername="+ownername);
System.out.println("address="+address);
}
}
class Currentaccount extends Account{
int overdraft;
Currentaccount(){
	overdraft=10000;
}
public void withdrawl()
	{
	balance=balance-10000;
	}
public void deposit(){
balance =balance +10000;
	}
public void display(){

System.out.println("balance="+balance);
System.out.println("accountnumber="+accountnumber);
System.out.println("ownername="+ownername);
System.out.println("address="+address);
System.out.println("overdraft="+overdraft);
}
}
class Main{
public static void main(String [] args){
System.out.println();
Savings s=new Savings();
s.deposit();
s.withdrawl();
s.amount();
s.display(); 
Currentaccount c=new Currentaccount();
System.out.println();
c.withdrawl();
c.deposit();
c.display();
}
}

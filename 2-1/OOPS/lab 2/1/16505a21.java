
import java.util.Scanner;
class Calc{
	public static void main(String[] args){

		int i,j,k,s;
		char a;Scanner l=new Scanner(System.in);
		System.out.println("input  numbers");
		i=l.nextInt();
		System.out.println("enter the corresponding number to perform operation");
		System.out.println("1:addition\n2:subtraction\n3:multiplication\n4:division");
			s=l.nextInt();
			System.out.println("input  numbers");
			j=l.nextInt();
			Sub obj=new Sub();

		if(s==1){
		k=obj.add(i,j);
		System.out.println("sum of "+i+" and "+j+" is "+k;
		}
		
		else if(s==2){
		k=obj.subtract(i,j);
		System.out.println("subtraction of "+i+" and "+j+" is "+k);
		}
		else if(s==3){
		k=obj.multiply(i,j);
		System.out.println("multiplication of "+i+" and "+j+" is "+k);
		}
		
		else if(s==4){
		if(j!=0){
		k=obj.division(i,j);
		System.out.println("division of "+i+" and "+j+" is "+k);
		}
		else{
			System.out.println("math error");
			}
		
		}
		else
		{
			System.out.println("invaid operation");
		}
		
	



	}
}



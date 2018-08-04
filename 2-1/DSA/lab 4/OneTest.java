class FirstSub{
String []sr=new String[12];
	int top=-1;
	int flag=0;
int g=0;
public void push(String item){
	top=top+1;
	sr[top]=item;
	}
public void pop(String item){
	if(top>=0){
	if((sr[top].equals("{"))&&(item.equals("}"))||(sr[top].equals("("))&&(item.equals(")"))||(sr[top].equals("["))&&(item.equals("]"))){
	System.out.println(sr[top]+ item);
	top=top-1;
	}
	else 
		flag=-1;
	
	}
	else if(isempty())
	{

		System.out.println("Stack is empty not balanced");
		g=-1;
	}
		
	else{
	
			flag=-1;
			top=top-1;
	}
	}

public boolean isempty(){
	if(top==-1){
		
	return(true);
		}
	else return(false);
}
	public void check(int c){
		if((flag==-1)||(g==-1)){
			System.out.println("not balanced");
	}
		else 
			System.out.println("balanced");
	} 
}


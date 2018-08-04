class Sub{
char [] c=new char[25];
char [] a=new char[25];
int top1=-1;
int top2=-1;
public void push(char ch){
	 if((ch=='*')||(ch=='/')||(ch=='-')||(ch=='+')||(ch=='^'))
	{
		if((ch=='*')||(ch=='/'))
		{
				if((a[top1]=='*')||(a[top1]=='/')||(a[top1]=='^'))
				{
				
				top2=top2+1;
				c[top2]=a[top1];
				a[top1]=ch;
				
				}
				else
				{
				top1=top1+1;
				a[top1]=ch;
			  	 }
		
		}
		else if((ch=='-')||(ch=='+'))
		{
				if((a[top1]=='+')||(a[top1]=='-')||(a[top1]=='*')||(a[top1]=='/')||(a[top1]=='^'))
				{
				
				top2=top2+1;
				c[top2]=a[top1];
				a[top1]=ch;
				
				}
				else
				{
				top1=top1+1;
				a[top1]=ch;
			  	 }
	}
		else if((ch=='^'))	
				{
				if(a[top1]=='^')
				{
				top2=top2+1;
				c[top2]=a[top1];
				a[top1]=ch;
				}
				else
				{
				top1=top1+1;
				a[top1]=ch;
			  	 }
	}
	}
	else if(ch=='(')
		{
		top1=top1+1;
		a[top1]=ch;
		}
	else if(ch==')')
		{
		while(a[top1]!='(')
		{
		top2=top2+1;
		c[top2]=a[top1];
		top1=top1-1;
		}
		top1=top1-1;
		}
	else {
		top2=top2+1;
		c[top2]=ch;
		}
	}
	public void print(){
	System.out.println();
		for(int i=0;i<=top2+1;i++){

			System.out.print(c[i]);
		}
	}
}


			

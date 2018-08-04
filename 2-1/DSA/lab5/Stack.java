package TwoStacks;

public class Stack {
	int[] ar=new int[5];
	int top=-1;
	int i,cnt=0;
	private int arr[];
	Stack()
	{
		int[] arr=new int[10];
		top=-1;
	}
	public void push(int item,int k,Stack s)
	{
		{	
			if(k==1)
			{
				if(this.top+1==s.top)
				{
					System.out.println("can't push "+item);
				}
				else
				{
					this.top=this.top+1;
					ar[this.top]=item;
				}
			}
			if(k==2)
			{
				if(this.top-1==s.top)
				{
					System.out.println("can't push "+item);
				}
				else
				{
					this.top=(ar.length-1)-cnt;
					ar[this.top]=item;
					cnt=cnt+1;
				}
			}
		}
	}
		public void printArray(Stack s,int k)
		{
			if(k==1)
			{
				for(i=0;i<=this.top;i++)
				{
					System.out.print(this.ar[i]+"  ");
				}
				for(i=this.top+1;i<s.top;i++)
				{
					System.out.print("___"+ "  ");
				}
				for(i=s.top;i<s.ar.length;i++)
				{
					System.out.print(s.ar[i]+"  ");
				}
			}
			else
			{
				for(i=0;i<=s.top;i++)
				{
					System.out.print(s.ar[i]+"  ");
				}
				for(i=s.top+1;i<this.top;i++)
				{
					System.out.print("___"+"  ");
				}
				for(i=this.top;i<this.ar.length;i++)
				{
					System.out.print(this.ar[i]+"  ");
				}
			}
		}
		public void printStack(int k)
		{
			if(k==1)
			{
				for(i=0;i<=this.top;i++)
				{
					System.out.print(ar[i]+"   ");
				}
			}
			else
			{
				for(i=this.top;i<ar.length;i++)
				{
					System.out.print(ar[i]+"   ");
				}
			}
		}
		public void pop(int k)
		{
			if(k==1)
			{
				this.top=this.top-1;
			}
			else
			{
				this.top=this.top+1;
			}
		}
	
}

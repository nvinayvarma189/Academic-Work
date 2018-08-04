import java.util.Scanner;

public class QueueStack {
	int[]arr;
	int top=-1;
	Queue_using_stack(int n)
	{
		arr=new int[n];
	}
	void push(int x)
	{
		if(top==-1)
		{
			top=0;
			arr[top]=x;
		}
		else if(top==arr.length-1)
				System.out.println("Stack is Full!");
		else
			top++;
			arr[top]=x;
	}
	int k;
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Nothing to Empty!");
			return 0;
		}
		else if(top==0)
			{
				k=arr[top];
				top=-1;
				return k;
			}
		else
			{
				k=arr[top];
				top--;
				return k;
			}				
	}
	void print()
	{
		System.out.println("The output queue ");
		while(top!=-1)
		{
			System.out.print(arr[top]+" ");
			top--;
		}
	}
	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter the size of queue ?");
		Scanner s =new Scanner (System.in);
		x=s.nextInt();
		QueueStack n= new QueueStack(x);
		System.out.println("Enter the no.?");
		for(int i=0;x>i;i++)
		{
			int y=s.nextInt();
			n.push(y);
		}
		s.close();
		QueueStack n1= new QueueStack(x);
		for(int i=0;x>i;i++)
		{
			int l=n.pop();
			n1.push(l);
		}
		n1.print();
		
	}

}

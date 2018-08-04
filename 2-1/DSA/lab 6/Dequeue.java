package Dequeue;

public class Dequeue {
	int[] ar=new int[10];
	int front=-1;
	int rear=-1;
	int n;
	Dequeue()
	{
		ar=new int[20];
		front=-1;
		rear=-1;
		n=5;
	}
	public boolean isEmpty()
	{
		if((front==-1)&&(rear==-1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean full()
	{
		if((front+1)==rear)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void insertFront(int item)
	{
		if(((rear+1)%n)==front)
		{
			System.out.println("Dequeue is full ");
		}
		else if(isEmpty())
		{
			front=rear=0;
			ar[front]=item;
		}
		else
		{
			front=(front+n-1)%n;
			ar[front]=item;
		}
	}
	public void insertLast(int item)
	{
		if(((rear+1)%n)==front)
		{
			System.out.println("Dequeue is full ");
			System.out.println("Can't insert");
		}
		else if(isEmpty())
		{
			front=rear=0;
			ar[front]=item;
		}
		else
		{
			rear=(rear+1)%n;
			ar[rear]=item;
		}
	}
	public void deleteFront()
	{
		if(isEmpty())
		{
			System.out.println("Dequeue is empty");
			System.out.println("Can't delete");
		}
		else if(front==rear)
		{
			front=rear=-1;
		}
		{
			front=(front+1)%n;
		}
	}
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("Dequeue is empty");
			System.out.println("Can't delete");
		}
		else if(front==rear)
		{
			front=rear=-1;
		}
		{
			rear=((rear+n-1)%n);
		}
	}
	public int getFront()
	{
		return ar[front];
	}
	public int getRear()
	{
		return ar[rear];
	}
	public void display()
	{
		int i=front;
		if(isEmpty())
		{
			System.out.println("Dequeue is empty");
		}
		else
		{
			while(i!=rear)
			{
				System.out.print(ar[i]+"  ");
				i=(i+1)%n;
			}
			System.out.print(ar[i]);
			System.out.println();
		}
	}
	
}

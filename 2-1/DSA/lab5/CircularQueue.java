package CircularInt;

public class CircularQueue {
	
		int[] ar=new int [5];
		int front=-1;
		int rear=-1;
		int i,j,flag=0;
		CircularQueue() { 
		    ar = new int[10]; 
		    front = -1; 
		    rear=-1; 
		}
		CircularQueue(int sz){
			ar=new int[sz];
			front=-1;
			rear=-1;
		}
		public void print()
		{
			if((front==-1)&&(rear==-1))
			{
				System.out.println("Circular Queue is Empty");
			}
			else
			{
				System.out.println(" ");
				for(i=front;i<=rear;i++)
				{
					System.out.print(ar[i]+"  ");
				}
			}
		}
		public void enqueue(int item)
		{
			if(front==((rear+1)%ar.length))
			{
				System.out.println("Can't Enqueue");
			}
			else if((front==-1)&&(rear==-1))
			{
				front=rear=0;
				ar[rear]=item;
			}
			else
			{
				rear=(rear+1)%ar.length;
				ar[rear]=item;
			}
		}
		public int getFront()
		{
			return ar[front];
			
		}
		public int dequeue()
		{
			if((front==-1)&&(rear==-1))
			{
				System.out.println("Cant Dequeue ");
				return -1;
			}
			else if(front==rear)
			{
				int k=ar[rear];
				front=rear=-1;
				return k;
			}
			else
			{
				int k=ar[front];
				front=((front+1+ar.length)%ar.length);
				return k;
				
			}
		}
		public boolean equals(CircularQueue qi2)
		{
			if((this.rear-this.front)==(qi2.rear-qi2.front))
			{
				for(i=this.front,j=qi2.front;i<=this.rear;i++,j++)
				{
					if(this.ar[i]!=qi2.ar[j])
					{
						flag=1;
						break;
					}
				}
			}
			else
			{
				flag=1;
			}
			if(flag==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public 	void splitq(CircularQueue q3,CircularQueue q4)
		{
			for(i=this.front;i<=this.rear;)
			{
				if(this.ar[i]%2==0)
				{
					q3.enqueue(this.ar[i]);
				}
				else
				{
					q4.enqueue(this.ar[i]);
				}
				i=((i+1)%this.ar.length);
			}
		}
		public int getMinimum()
		{
			int min=ar[front];
			for(i=front;i<=rear;)
			{
				if(ar[i]<min)
				{
					min=ar[i];
				}
				i=((i+1)%ar.length);		
			}
			return min;
		}
}

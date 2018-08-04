package QueueInt;

public class QueueInt {
		int[] ar=new int [5];
		int front=-1;
		int rear=-1;
		int i,j,flag=0;
		QueueInt() { 
		    ar = new int[10]; 
		    front = -1; 
		    rear=-1; 
		}
		QueueInt(int sz){
			ar=new int[sz];
			front=-1;
			rear=-1;
		}
		public void print(){
			if((front==-1)&&(rear==-1))
			{
				System.out.println("Queue is Empty");
			}
			else{
				System.out.println(" ");
				for(i=front;i<=rear;i++)
				{
					System.out.print(ar[i]+"  ");
				}
			}
		}
		public void enqueue(int item)
		{
			if((front==-1)&&(rear==-1))
			{
				front=rear=0;
				ar[rear]=item;
			}
			else if(rear==ar.length-1)
			{
				System.out.println("Can't Enqueue ");
			}
			else
			{
				rear=rear+1;
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
				front=front+1;
				return k;
				
			}
		}
		public boolean equals(QueueInt qi2)
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
		
}

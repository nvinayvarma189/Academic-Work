package Dequeue;

public class DequeueTest {
	public static void main(String[] args)
	{
		Dequeue d=new Dequeue();
		d.insertFront(10); 
		d.display();
		d.insertLast(20); 
		d.display();
		d.insertFront(30); 
		d.display();
		d.deleteFront(); 
		d.display();
		d.deleteLast(); 
		d.display();
		d.insertLast(25); 
		d.display();
		d.insertFront(40); 
		d.display();
		d.insertFront(50); 
		System.out.println(d.getRear()); 
		System.out.println(d.getFront());
		d.display();
		
	}

}

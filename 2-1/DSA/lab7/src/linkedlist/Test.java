package linkedlist;

public class Test {
	public static void main(String [] args){
		singlylinkedlist ob1 = new singlylinkedlist();
		ob1.Insert_At_Head(90);
		ob1.print();
		ob1.Insert_At_Head(10);
		ob1.print();
		ob1.insert_At_Tail(5);
		ob1.print();
		ob1.insert_At_Tail(6);
		ob1.print();
		ob1.insert_At_position(12,5);
		ob1.print();
		ob1.Delete_At_Position(0);
		ob1.print();
		ob1.Insert_At_Head(5);
		ob1.Delete_A_Value(5);
		ob1.print();
		ob1.Number_Of_Element();
		System.out.println("The sum of elements is " + ob1.sum_of_elements());
		ob1.change_value(1,5);
		ob1.print();
		//ob1.move();
		ob1.print();
		//ob1.reversewithrecursion(ob1.head,ob1.head.next);
		ob1.print();
		singlylinkedlist ob2 = new singlylinkedlist();
		ob2.Insert_At_Head(5);
		ob2.Insert_At_Head(6);
		ob2.Insert_At_Head(7);
		ob2.Insert_At_Head(8);
		singlylinkedlist ob3 = new singlylinkedlist();
		ob3.head = ob2.split();
		ob2.print();
		ob3.print();
		singlylinkedlist ob4 = new singlylinkedlist();
		ob4.enqueue(1);
		ob4.enqueue(2);
		ob4.enqueue(3);
		ob4.enqueue(4);
		ob4.dequeue();
		ob4.print();
		singlylinkedlist ob5 = new singlylinkedlist();
		ob5.push(1);
		ob5.push(2);
		ob5.push(3);
		ob5.push(4);
		ob5.pop();
		ob5.print();
		singlylinkedlist ob6 = new singlylinkedlist();
		ob6.Insert_At_Head(1);
		ob6.Insert_At_Head(2);
		ob6.Insert_At_Head(3);
		ob6.Insert_At_Head(4);
		ob6.Insert_At_Head(5);
		ob6.print();
		ob6.reversewithrecursion(ob6.head,0);
		ob6.print();
		
		
		
	}
}

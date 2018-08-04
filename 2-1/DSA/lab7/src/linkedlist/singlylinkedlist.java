package linkedlist;

public class singlylinkedlist {
	public Node head = null;
	public Node temp1 = head;
	public void Insert_At_Head(int x){
		Node newnode = new Node(x);
		if (head == null){
			head = newnode;
		}
		else{
			newnode.next= head;
			head = newnode;
		}
	}
	public void print(){
		if (head == null){
			System.out.println("Linked List is Empty");
		}
		else{
			Node temp = head;
			while (temp != null){
				System.out.print(temp.data);
				System.out.print(" ");
				temp = temp.next;
			}
			System.out.println("");
		}
	}
	public void insert_At_Tail(int value){
		Node newnode = new Node(value);
		if (head == null){
			head = newnode;
		}
		else{
			Node temp = new Node();
			temp = head;
			while (temp.next != null){
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.next = null;
		}
	}
	public void insert_At_position(int value,int position){
		Node temp = new Node();
		temp = head;
		int count = 0;
		if (position == 0){
			this.Insert_At_Head(value);
			return;
		}
		while (count != position - 1){
			if (temp.next == null){
				System.out.println("Crossed Linked List Size");
				return;
			}
			temp = temp.next;
			count = count + 1;
		}
		Node newnode = new Node(value);
		newnode.next = temp.next;
		temp.next = newnode;
	}
	public void Delete_At_Position(int k){
		Node temp = new Node();
		temp = head;
		int count = 0;
		if (k == 0){
			head = head.next;
		}
		while (count != k - 1){
			if (temp.next.next == null){
				System.out.println("Crossed Linked List Size");
				return;
			}
			temp = temp.next;
			count = count + 1;
		}
		temp.next = temp.next.next;
	}
	public void Delete_A_Value(int x){
		Node temp = head;
		if (temp.data == x){
			head = head.next;
			temp = temp.next;
		}
		while (temp.next != null){
			if (temp.next.data == x){
				temp.next = temp.next.next;
			}
			temp = temp.next;
		}
	}
	public void Number_Of_Element(){
		int count = 0;
		Node temp = head;
		while (temp != null){
			temp = temp.next;
			count = count + 1;
		}
		System.out.println("The number of elements are " + count);
	}
	public int sum_of_elements(){
		int sum = 0;
		Node temp = head;
		while (temp != null){
			sum = sum + temp.data;
			temp = temp.next;
		}
		return sum;
	}
	public void change_value(int position,int value){
		Node temp = head;
		int count = 0;
		if (position == 0){
			head.data = value;
			return;
		}
		while (count != position){
			if (temp.next == null){
				System.out.println("Crossed Linked List Size");
				return;
			}
			temp = temp.next;
			count = count + 1;
		}
		temp.data = value;
	}
	public void move(){
		Node temp = head;
		int max = head.data;
		int pos = 0;
		int count = 0;
		Node temp1 = new Node();
		temp1 = head;
		while (temp != null){
			temp1 = temp;
			if (max < temp.data){
				max = temp.data;
				pos = count;
			}
			temp = temp.next;
			count = count + 1;
		}
		temp = head;
		while (pos > 0){
			temp = temp.next;
			pos = pos - 1;
		}
		temp.next = temp.next.next;
		Node newnode = new Node(max);
		temp1.next = newnode;
	}
	public void search(int value){
		Node temp = head;
		int count = 0;
		while (temp != null){
			if (temp.data == value){
				System.out.println("Found at index " + count);
			}
			count = count + 1;
			temp = temp.next;
		}
	}
	public void conc(singlylinkedlist temps){
		Node temp = head;
		while (temp.next != null){
			temp = temp.next;
		}
		temp.next = temps.head;
	}
	public void delete(){
		Node temp = head;
		while (temp.next != null){
			if (temp.next.data%2 == 0){
				temp.next = temp.next.next;
			}
		}
	}
	public void reversewithrecursion(Node temp,int count){
		if (temp.next.next == null){
			temp.next.next = temp;
			System.out.println(temp.data);
			head = temp.next;
			return;
		}
		else{
			reversewithrecursion(temp.next,count+1);
			temp.next.next = temp;
			if (count == 0){
				temp.next = null;
			}
		}
	}
	public Node split(){
		singlylinkedlist e = new singlylinkedlist();
		singlylinkedlist o = new singlylinkedlist();
		int i=0;
		Node temp = new Node();
		temp = head;
		while (temp != null){
			if (i%2 == 0){
				e.insert_At_Tail(temp.data);
			}
			else{
				o.insert_At_Tail(temp.data);
			}
			i = i + 1;
			temp = temp.next;
		}
		head = e.head;
		return o.head;
	}
	public void push(int x){
		this.insert_At_Tail(x);
	}
	public int pop(){
		Node temp = new Node();
		temp = head;
		int x = 0;
		while (temp != null){
			if (temp.next.next == null){
				temp.next = null;
				x = temp.data;
				break;
			}
			temp = temp.next;
		}
		return x;
	}
	public void enqueue(int x){
		this.insert_At_Tail(x);
	}
	public int dequeue(){
		Node temp = new Node();
		temp = head;
		head = head.next;
		return temp.data;
	}
	public void printnew(){
		System.out.println(head.data);
	}
}

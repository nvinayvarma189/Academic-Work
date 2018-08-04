public class SortedList{
		public Node head=null;
		public void insert(int value){
			Node newnode=new  Node(value);
		if(head==null){
			head=newnode;
			newnode.next=head;
		}
		else{
			Node temp=head;	
			while(temp.next!=head){
			temp=temp.next;
			}
			temp.next=newnode;
			newnode.next=head;
		}
		}
		public void Sorted_List(int value){
			Node newnode=new  Node(value);
			Node temp=head;
				
			do{
				if(temp.next.data>value){
					newnode.next=temp.next;
					temp.next=newnode;
					break;
				}
				temp=temp.next;
			}while(temp!=head);
		} 
		public void print(){
		if(head==null){
		System.out.println("Empty list");
		}
		else{
		Node temp=head;
		do{
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}while(temp!=head);
	}	
	}
	}
		

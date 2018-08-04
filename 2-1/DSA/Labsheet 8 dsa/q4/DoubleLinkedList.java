class DoubleLinkedList{
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
	public void insert_after_node(int value,int k){
		Node newnode=new  Node(value);
		if(head==null){
			head=newnode;
		}
	
		else{
			int i=1;
			Node temp=head;	
			while(i<k-1){
			temp=temp.next;
			i++;
			}
			newnode.next=temp.next;
			temp.next.prev=newnode;
			temp.next=newnode;
			newnode.prev=temp;
			
		}	
	}
	public void delete_at_pos(int k){
		if(head==null){
			System.out.println("Linked List is empty");
		}
		else{
			Node temp=head;
			Node temp2=head;	
			int i=1;
			while(i<k-1){
			temp=temp.next;
			i=i+1;
			}
			temp2=temp.next;
			temp2.next.prev=temp;
			temp.next=temp2.next;
		}	
	 }
}

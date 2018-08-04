class CircularLinkedList{
	public Node head=null;
	public void insert_at_head(int value){
		Node newnode=new Node(value);
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
			head=newnode;
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
	public void insert_at_tail(int value){
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
	public void insert_after_node(int value,int node){
		Node newnode=new  Node(value);
		if(head==null){
			head=newnode;
		}
		else{
			Node temp=head;	
			while(temp.data!=node){
			temp=temp.next;
			}
			newnode.next=temp.next;
			temp.next=newnode;
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
			temp.next=temp2.next;
		}	
	 }
	public void delete_at_value(int value){
		int flag=-1;
		if(head==null){
			System.out.println("Linked List is empty");
		}
		else{
			Node temp=head;
			Node temp2=head;	
			do{
				if(temp.next.data==value){
					temp2=temp.next.next;
					temp.next=temp2;
					
					 flag=0;
				}
				temp=temp.next;
			}while(temp.next!=head);
			if(flag!=0){
				System.out.println("element not found");
			}
		}	
	 }
	
	
		
		
		
}

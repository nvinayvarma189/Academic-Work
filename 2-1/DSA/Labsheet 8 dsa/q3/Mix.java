class Mix{
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
	public void combain(Mix m2){
		Node HEAD=m2.head;
		Node temp=HEAD;

		Node temp2=head;
		do{
			temp=temp.next;
		}while(temp.next!=HEAD);
		temp.next=temp2;
		while(temp2.next!=head){
			temp2=temp2.next;
			}
		temp2.next=HEAD;
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
			
	
		

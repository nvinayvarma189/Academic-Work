class Main{
	public static void main(String []args){
	 DoubleLinkedList d=new DoubleLinkedList();
	d.insert(10);
	d.insert(20);
	d.insert(30);
	d.insert(40);
	d.insert(50);
	d.print();
	System.out.println();
	d.insert_after_node(35,3);
	d.print();
	d.delete_at_pos(3);
	System.out.println();
	d.print();
	}
}
	
	

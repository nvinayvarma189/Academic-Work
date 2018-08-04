class Test{
	public static void main(String[] args){
		CircularLinkedList c1=new CircularLinkedList();
		c1.insert_at_head(10);
		c1.insert_at_head(20);
		c1.insert_at_head(30);
		c1.print();
		System.out.println();
		c1. insert_at_tail(40);
		c1. insert_at_tail(50);
		c1. insert_at_tail(60);
		c1.print();
		System.out.println();
		c1. insert_after_node(100,30);
		c1.print();
		System.out.println();
		c1.delete_at_pos(2);
		c1.print();
		System.out.println();
		c1.delete_at_pos(5);
		c1.print();
		System.out.println();
		c1.delete_at_value(10);
		c1.print();
		
	}
}

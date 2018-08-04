class Main{
	public static void main(String[] args){
		Mix m1=new Mix();
		m1.insert(10);
		m1.insert(20);
		m1.insert(30);
		m1.print();
		System.out.println();
		Mix m2=new Mix();
		m2.insert(40);
		m2.insert(50);
		m2.insert(60);
		m2.insert(70);
		m2.insert(80);
		m2.print();
		System.out.println();
		m1.combain(m2);
		m1.print();
	}
}		

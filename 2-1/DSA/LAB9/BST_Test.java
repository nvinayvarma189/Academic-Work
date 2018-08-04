package bst;

public class BST_Test 
{
	public static void main (String [] args)
	{
		BST ob1 = new BST();
		ob1.insert(100);
		ob1.insert(50);
		ob1.insert(75);
		ob1.insert(300);
		ob1.insert(250);
		ob1.insert(20);
		ob1.insert(70);
		ob1.insert(400);
		ob1.insert(150);
		ob1.insert(80);
		ob1.displayInorder(ob1.root);
		System.out.println(" ");
		ob1.displayPreorder(ob1.root);
		System.out.println(" ");
		ob1.displayPostOrder(ob1.root);
		System.out.println(" ");
		ob1.find(ob1.root,20);
		ob1.find(ob1.root,25);
		ob1.find(ob1.root,250);
		ob1.get_min(ob1.root);
		ob1.display_max(ob1.root);
		
		ob1.delete(ob1.root, 20);
		ob1.displayInorder(ob1.root);
		System.out.println(" ");
			ob1.delete(ob1.root, 75);
		ob1.displayInorder(ob1.root);
		System.out.println(" ");
		ob1.delete(ob1.root, 300);
		ob1.displayInorder(ob1.root);
		System.out.println(" ");
		//ob1.delete(ob1.root, 100);
		//ob1.displayInorder(ob1.root); Not getting deleted, instead 150 gets deleted
		
		
		
		
	}
}

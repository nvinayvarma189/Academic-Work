package bst;

public class BST 
{
	public Node root;
	public Node temp;
	public Node parent;
	
	BST()
	{
		root=null;
	}
	
	public void find (Node root1,int x)
	{
		temp=root1	;
		if (temp!=null)
		{	
			if (temp.data==x)
			{
					System.out.println ("Element "+x+" is found");
			}
			else if (x<temp.data)
			{	
				find (temp.left,x);
			}
			else
			{
				find (temp.right,x);
			}
		}
		else
		{
			System.out.println ("Element "+x+" doesnt exist");
		}
		
	}		
	
	public void insert(int x)
	{
		Node newnode = new Node();
		newnode.data=x;
		
		if (root==null)
		{
			root=newnode;
			return;
		}
		temp=root;
		parent = null;
		while (true)
		{
			parent = temp;
			if (x<temp.data)
			{
				temp=temp.left;
				if (temp==null)
				{
					parent.left = newnode;
					return;
				}
			}
			else
			{
				temp=temp.right;
				{
					if (temp==null)
					{
						parent.right= newnode;
						return;
					}
				}
			}
			
		}	
	}
	
	public void displayInorder(Node root)
	{
		if (root!=null)
		{
			displayInorder(root.left);
			System.out.print(+root.data+" ");
			displayInorder(root.right);
		}
	}
	
	public void displayPreorder(Node root)
	{
		if (root!=null)
		{
			System.out.print(+root.data+" ");
			displayPreorder (root.left);
			displayPreorder (root.right);	
			
		}
	}
	
	public void displayPostOrder(Node root)
	{
		if (root!=null)
		{
			displayPostOrder(root.left);
			displayPostOrder (root.right);
			System.out.print(+root.data+" ");
			
		}
	}
	
	public void get_min(Node root)
	{
		temp=root;
		while (temp.left!=null)
		{
			temp=temp.left;
		}
		System.out.println ("The minimum value is "+temp.data);
	}
	
	public void display_max(Node root)
	{
		temp=root;
		while (temp.right!=null)
		{
			temp=temp.right;
		}
		System.out.println("The maximum value is "+temp.data);
	}
	
	
	public void delete (Node root, int x)
	{
		temp=root;
		parent =root;
		boolean isLeftChild=false;
		while (temp.data!=x)
		{
			parent = temp;
			if (x<temp.data)
			{
				isLeftChild= true;
				temp=temp.left;
			}
			else
			{
				isLeftChild = false;
				temp=temp.right;
			}
			if (temp==null)
			{
				System.out.println("BST is Empty");
			}	 	
		}
		
		if (temp.left==null&&temp.right==null)//no child
		{
			if (temp==root)//only root node exist
			{
				root=null;
			}
			if (isLeftChild==true)
			{
				parent.left=null;
			}
			else
				parent.right=null;
		}
		else if (temp.right==null)
		{
			if (temp==root)
			{
				root=temp.left;
			}
			else if (isLeftChild)
			{
				parent.left=temp.left;
			}
			else
				parent.right=temp.left;
		}
		else if (temp.left==null)
		{
			if (temp==root)
			{
				root=temp.right;
			}
			else if(isLeftChild)
			{
				parent.left=temp.right;
			}
			else
			
				parent.right=temp.right;
		}
		else if (temp.left!=null && temp.right!=null)
		{	
			Node successor = getSuccessor(temp);
			if (temp==root)
			{
				root=successor;
			}
			else if (isLeftChild)
				parent.left= successor;
			else
			{
				parent.right=successor;
			}
			successor.left=temp.left;
		}
	}
	
	public Node getSuccessor(Node deleteNode)
	{
		Node successor = null;
		Node successorParent = null;
		Node temp = deleteNode.right;
		while (temp!=null)
		{
			successorParent = successor;
			successor=temp;
			temp=temp.left;
		}
		if (successor!= deleteNode.right)
		{
			successorParent.left= successor.right;
			successor.right=deleteNode.right;
		}
		return successor;
	}
}

package graph;

import java.util.Scanner;
public class GraphTest 
{
	public static void main (String [] args)
	{
		Scanner s = new Scanner(System.in); 
		System.out.println ("Enter the number of vertices");
		int v= s.nextInt();
		AdjMatrix mat = new AdjMatrix(v);
		System.out.println("Enter the number of edges");
		int e=s.nextInt();
		mat.addEdges(e);
		
		
		mat.board();
		mat.print();
		mat.update(e);
		mat.print();
		
	}
	
	
}

package TwoStacks;

public class Test {
	public static void main(String[] args) {
		Stack s1=new Stack();
		Stack s2=new Stack();
		s1.push(4, 1,s2);
		s2.push(5, 2,s1);
		s1.printArray(s2,1);
		s2.push(7, 2, s1);
		s1.push(9, 1, s2);
		s2.push(0, 2, s1);
		s1.push(6, 1, s2);
		System.out.println("Single array with two stacks:  ");
		s2.printArray(s1, 2);
		System.out.println("First Stack:  ");
		s1.printStack(1);
		System.out.println("Second Stack:  ");
		s2.printStack(2);
		s1.pop(1);
		s2.pop(2);
		System.out.println("Single array with two stacks:  ");
		s1.printArray(s2, 1);

	}

}

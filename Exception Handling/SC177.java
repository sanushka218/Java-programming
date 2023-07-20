//User defined exception-STACK class
class StackOverflow extends Exception{
	public String toString()
	{
		return "Stack is full";
	}
}
class StackUnderflow extends Exception{
	public String toString()
	{
		return"Stack is empty";
	}
}
class Stack{
	private int n=10;
	private int top=-1;
	private int s[];
	
	public Stack()
	{
		s=new int[10];
	}
	
	public void push(int x)throws StackOverflow{
		if(top==9)
			throw new StackOverflow();
		top++;
		s[top]=x;	
	}
	
	public void pop()throws StackUnderflow{
		if(top==-1)
			throw new StackUnderflow();
		top--;
	}
	
	public void display()
	{
		System.out.println("The elements of stack are");
		for(int i=top;i>=0;i--)
		{
			System.out.print(" "+s[i]+" ");
		}
	}
	
}
public class SC177 {

	public static void main(String[] args) {
		Stack s1= new Stack();
		try {
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		s1.push(6);
		s1.push(7);
		s1.push(8);
		s1.push(9);
		s1.push(10);
		//s1.push(11); //exception causing line
		s1.display();
		System.out.println();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		//s1.pop();//exception causing line
		s1.display();
		}
		catch(StackOverflow e)
		{
			System.out.println(e);
		}
		catch(StackUnderflow e)
		{
			System.out.println(e);
		}
		
		
		

	}

}

package ds.stack;

public class Stack {

	private int maxSize;
	private int top;
	private long[] array;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.array  = new long[maxSize];
		this.top = -1;
	}

	public void push(int val) {
		if(!peak()) {
			top++;
			array[top] = val;
		}else {
			System.out.println("stack out of size");
		}
	}

	public long pop() {
		int old_top = top;
		top--;
		return array[old_top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean peak() {
		return (top == maxSize-1); 
		
	}	
}

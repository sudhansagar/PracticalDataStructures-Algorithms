package ds.stack;

public class ReverseStack {

	private int maxSize;
	private int top;
	private char[] array;

	public ReverseStack(int maxSize) {
		this.maxSize = maxSize;
		this.array  = new char[maxSize];
		this.top = -1;
	}

	public void push(char val) {
		if(!isFull()) {
			top++;
			array[top] = val;
		}else {
			System.out.println("stack out of size");
		}
	}

	public char pop() {
		if(isEmpty()) {
			System.out.println("stack is already empty");
			return '0';
		}else {
			int old_top = top;
			top--;
			return array[old_top];
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}
	
	public long peakVal() {
		return array[top];
	}
	
	public boolean isFull() {
		return (top == maxSize-1); 
		
	}	
}

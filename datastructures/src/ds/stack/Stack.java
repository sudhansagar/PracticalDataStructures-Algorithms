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
		if(!isFull()) {
			top++;
			array[top] = val;
		}else {
			System.out.println("stack out of size");
		}
	}

	public long pop() {
		if(isEmpty()) {
			System.out.println("stack is already empty");
			return -1;
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

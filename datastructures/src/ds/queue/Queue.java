package ds.queue;

public class Queue {

	private int maxSize;
	private int rear;
	private int front;
	private long[] array;
	private long items;

	public Queue(int size) {
		this.maxSize = size;
		this.array = new long[size];
		this.rear = -1;
		this.front = 0;
		this.items = 0;
	}

	public void insert(long j) {
		if (isFull()) {
			rear = -1;
		}
		rear++;
		array[rear] = j;
		items++;

	}

	public long remove() {
		long temp = array[front];
		front++;
		if(front == maxSize){
			front = 0;
		}
		items --;
		return temp;
	}
	
	public long peekFront(){
		return array[front];
	}
	
	public boolean isEmpty(){
		return (items ==0);
	}
	
	public boolean isFull(){
		return (items == maxSize);
	}

	public void view() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

}

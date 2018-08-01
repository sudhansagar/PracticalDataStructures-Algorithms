package ds.circularlinkedlist;

public class CirclularLinkedList {

	public Node first;
	public Node last;
	
	public CirclularLinkedList() {
		
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode; 
		
	} 
	
	private boolean isEmpty() {
		return (first == null);
	}

	public void dispalyLinkedList() {
		Node currentNode = first;
		while(currentNode!=null) {
			currentNode.displayNode(currentNode);
			currentNode = currentNode.next;
		}
	} 
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			first = newNode;
		}else{
			last.next = newNode;
			last = newNode;
		}
		
	}
}

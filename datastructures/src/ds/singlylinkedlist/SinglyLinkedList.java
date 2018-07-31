package ds.singlylinkedlist;

public class SinglyLinkedList {

	public Node first;
	
	public SinglyLinkedList() {
		
	}
	
	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode; 
		
	} 
	
	public void dispalyLinkedList() {
		Node currentNode = first;
		while(currentNode!=null) {
			currentNode.displayNode(currentNode);
			currentNode = currentNode.next;
		}
	} 
	
	public void insertLast(int data) {
		Node currentNode = first;
		while(currentNode.next !=null) {
			currentNode = currentNode.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		currentNode.next = newNode;
	}
}

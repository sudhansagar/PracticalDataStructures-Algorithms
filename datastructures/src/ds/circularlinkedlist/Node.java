package ds.circularlinkedlist;

public class Node {
	
	public int data;
	public Node next;
	
	public Node() {

	}
	public void displayNode(Node node) {
		System.out.println("{" + node.data + "}");
	}
}

package ds.linkedlist;

public class App {

	public static void main(String[] args) {
		Node node1 = new Node();
		node1.data = 1;
		
		
		Node node2 = new Node();
		node2.data = 2;
		
		Node node3 = new Node();
		node3.data = 3;
		
		Node node4 = new Node();
		node4.data = 4;
		
		Node node5 = new Node();
		node5.data = 5;
		
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		System.out.println(nodeLength(node1));
		
		System.out.println(nodeLength(node4));
		
	}

	private static int nodeLength(Node node) {
		int length = 0;
		Node currentNode = node;
		while(currentNode.next != null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}

}

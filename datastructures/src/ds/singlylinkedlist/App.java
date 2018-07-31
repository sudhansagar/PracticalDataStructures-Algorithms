package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		list.insert(10);
		list.insert(20);
		list.insert(30);
		
		//list.dispalyLinkedList();
		
		list.insertLast(50);
		
		list.dispalyLinkedList();
		
	}

}

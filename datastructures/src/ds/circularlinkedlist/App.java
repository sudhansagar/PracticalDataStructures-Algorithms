package ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		CirclularLinkedList list = new CirclularLinkedList();

		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		
		list.dispalyLinkedList();
		
		System.out.println("-----Inserting at last -----");
		list.insertLast(50);
		System.out.println("-----After inserting at last------");
		list.dispalyLinkedList();
		
	}

}

package ds.queue;

public class App {
	
public static void main(String[] args) {
	Queue qObj = new Queue(3);
	qObj.insert(1);
	qObj.insert(2);
	qObj.insert(3);
	/*qObj.insert(4);
	qObj.insert(5);
	qObj.insert(6);*/

	qObj.view();
	
	//System.out.println(" peekFront : " +qObj.peekFront()); 
	
	//System.out.println("removed : " +qObj.remove());
	
	
	
	
}
}

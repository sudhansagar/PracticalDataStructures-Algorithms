package ds.stack;

public class App {
	
	public static void main(String[] args) {
		Stack stackObj = new Stack(2);
		stackObj.push(10);
		stackObj.push(20);
		stackObj.push(30);
		stackObj.push(40);
		
		
		while(!stackObj.isEmpty()) {
			System.out.println(stackObj.pop());
		}

	}
}

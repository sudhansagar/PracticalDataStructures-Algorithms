package ds.stack;

public class App {

	public static void main(String[] args) {
		/*
		 * Stack stackObj = new Stack(4); stackObj.push(10); stackObj.push(20);
		 * stackObj.push(30); stackObj.push(40);
		 * 
		 * 
		 * while(!stackObj.isEmpty()) { System.out.println(stackObj.pop()); }
		 * 
		 * //System.out.println(stackObj.pop());
		 */

		System.out.println(reverseString("Madhusudhan"));
		
	}
	public static String reverseString(String str) {
		// Reverse a string
		ReverseStack rstackObj = new ReverseStack(str.length());
		char[] charStr = str.toCharArray(); 
		for (int i = 0; i < str.length(); i++) {
			rstackObj.push(charStr[i]);
		}
		String temp = "";
		while(!rstackObj.isEmpty()) {
			 temp = temp + rstackObj.pop();
		}
		return temp; 
	}
	
}

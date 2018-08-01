package algo.linearsearch;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = new int[]{ 1,2,3,4,5,6,7,8,9,10 };  
		System.out.println(" Item found at : " +linearSearch(a, 8) + " index");
	}
	
	public static int linearSearch(int [] a, int x){
		for(int i=0; i<a.length; i++){
			if(a[i] == x){
				return i;
			}
		}
		return -1;
	}
}

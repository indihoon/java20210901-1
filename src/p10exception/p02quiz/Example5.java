package p10exception.p02quiz;

public class Example5 {
	// ArrayIndexOutOfBoundsException
	
	public static void main(String[] args) {
		int[] arr = {3,3};
		
		System.out.println(arr[1]);
		
		throw new ArrayIndexOutOfBoundsException();
	}
}

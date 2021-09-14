package p96etc;

import java.util.Arrays;

public class FillArrayValues {
	public static void main(String[] args) {
		AClass a = new AClass();
		int[] arr = a.getArr();
		
		System.out.println(Arrays.toString(arr));
	}
}

class AClass {
	private int[] arr;
	
	AClass() {
		arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 300;
		}
	}
	public int[] getArr() {
		return arr;
	}
}

package p99codingbat;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		String str = "java 44 55";
		Scanner scanner = new Scanner(str);
		
		boolean b1 = scanner.hasNextInt();
//		int i1 = scanner.nextInt();
//		
		System.out.println(b1);
		
		System.out.println(scanner.hasNext());
//		System.out.println(i1);
//		
//		boolean b2 = scanner.hasNextInt();
//		int i2 = scanner.nextInt();
//		
//		System.out.println(b2);
//		System.out.println(i2);
//		
//		boolean b3 = scanner.hasNextInt();
//		int i3 = scanner.nextInt();
//		
//		System.out.println(b3);
//		System.out.println(i3);
//		
//		boolean b4 = scanner.hasNextInt();
//		System.out.println(b4);
		
		
		scanner.close();
	}
}	

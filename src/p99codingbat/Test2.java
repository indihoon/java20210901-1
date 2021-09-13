package p99codingbat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("src/p99codingbat/input10951.txt"));
			while (scanner.hasNextLine()) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				
				System.out.println(a + b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) 
				scanner.close();
		}
	}
}


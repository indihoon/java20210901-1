package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.print("l:list, e:exit 입력>");
			String str = scanner.nextLine();
			
			switch (str) {
			case "l":
				for (String s : list) {
					System.out.println(s);
				}
				break;
			case "e":
				run = false;
				break;
				
			default:
				list.add(str);
				break;
			}
		}
		
		scanner.close();
	}
}

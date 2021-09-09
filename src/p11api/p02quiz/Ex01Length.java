package p11api.p02quiz;

import java.util.Scanner;

public class Ex01Length {
	// scanner
	// loop
	// 입력받은 문자열이 몇 글자인지 출력하는 코드
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while (run) {
			System.out.print("입력:");
			String str = scanner.next();
			
			if (str.equals("quit")) {
				break;
			}
			
			System.out.println(str.length() + "글자 입니다.");
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
	}
}








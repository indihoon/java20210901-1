package p18io.p02quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) throws Exception {
		OutputStream os = getOutputStream("C:\\Users\\user\\Desktop\\iotest\\outtestI.txt");
		Scanner scanner = new Scanner(System.in);
		
		String input = null;
		boolean run = true;
		while (run) {
			System.out.print("입력:");
			input = scanner.nextLine();
			
			// input을 outtestI.txt 파일에 쓰기
			// exit를 입력받으면 loop 종료
		}
		
		System.out.println("종료");
		scanner.close();
		os.close();
	}

	public static OutputStream getOutputStream(String file) throws Exception {
		return new FileOutputStream(file);
	}
}

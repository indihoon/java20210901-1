package p18io.p03lecture.p06filter;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex11MultiFilter {
	public static void main(String[] args) {
		String file = "C:\\Users\\user\\Desktop\\iotest\\outtestJ.txt";
		
		InputStream is = new FileInputStream(file);
		// inputStream to Reader
		// Reader를 BufferedReader로 감싸서 (BufferedReader의 변수 br)
		
		// 읽어서 출력
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		System.out.println("종료");
		is.close();
	}
}

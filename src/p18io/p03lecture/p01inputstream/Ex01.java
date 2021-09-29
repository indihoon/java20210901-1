package p18io.p03lecture.p01inputstream;

import java.io.File;

public class Ex01 {
	public static void main(String[] args) {
		String fileName = "src/p18io/p03lecture/p01inputstream/Ex01.java";
		
		File file = new File(fileName);
		System.out.println(file.exists());
	}
}

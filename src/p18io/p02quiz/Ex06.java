package p18io.p02quiz;

import java.io.FileReader;
import java.io.Reader;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\iotest\\test3.txt";
		Reader r = new FileReader(fileName);
		
		
		
		r.close();
	}
}

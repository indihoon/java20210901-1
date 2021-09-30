package p18io.p02quiz;

import java.io.FileWriter;
import java.io.Writer;

public class Ex09 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\outtest8.txt";
		Writer wr = new FileWriter(file);
		
		// ABCDE~Z
		
		wr.close();
	}
}

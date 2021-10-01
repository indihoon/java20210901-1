package p18io.p03lecture.p06filter;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex04BufferedOutputStream {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\outtestF.txt";
		OutputStream os = new FileOutputStream(file);
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1024 * 1024 * 500; i++) {
			os.write('a');
		}
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) + "ms");
		
		os.close();
	}
}

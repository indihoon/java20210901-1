package p18io.p03lecture.p06filter;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex05BufferedInputStream {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\outtestF.txt";
		InputStream is = new FileInputStream(file);

		long start = System.currentTimeMillis();
		while (is.read() != -1) {//1346ms 1326ms

		}
		long end = System.currentTimeMillis();

		System.out.println((end - start) + "ms");
		is.close();

	}
}

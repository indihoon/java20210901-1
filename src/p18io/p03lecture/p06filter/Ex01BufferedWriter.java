package p18io.p03lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Ex01BufferedWriter {
	public static void main(String[] args) throws Exception {
		// BufferedWriter
		// 빠른 속도
		
		String name = "C:\\Users\\user\\Desktop\\iotest\\outtestE.txt";
		Writer writer = new FileWriter(name);
		BufferedWriter bw = new BufferedWriter(writer);
		char[] datas = new char[1024];
		
		for (int i = 0; i < datas.length; i++) {
			datas[i] = (char) (((int) (Math.random() * 26)) + 'a');
		}
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1024 * 1024 * 5; i++) {
//			writer.write(datas);
			bw.write(datas);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start + "밀리세컨드");
		
		System.out.println("종료");
		
		bw.close();
		writer.close();
	}
}

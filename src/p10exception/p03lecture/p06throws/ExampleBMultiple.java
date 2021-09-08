package p10exception.p03lecture.p06throws;

import java.io.FileReader;

public class ExampleBMultiple {
	public static void main(String[] args) throws Exception {
		method1();
	}

	public static void method1() throws Exception {
		Class.forName("");

		FileReader fr = new FileReader("");

		fr.close();
	}
}

package p99codingbat;

public class String2 {
	public String doubleChar(String str) {

		String result = "";
		int len = str.length();

		for (int i = 0; i < len; i++) {
			result += str.charAt(i);
			result += str.charAt(i);
		}

		return result;
	}

}

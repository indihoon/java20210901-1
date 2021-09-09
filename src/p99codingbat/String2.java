package p99codingbat;

public class String2 {
	public int countHi(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("hi")) {
				count++;
			}
		}

		return count;
	}

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

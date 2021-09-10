package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex11Example {
	public static void main(String[] args) {
		// 전화번호 010-####-####
		
		String p1 = "010-\\d{4}-\\d{4}";
		
		System.out.println(Pattern.matches(p1, "010-8888-1234"));
	}
}

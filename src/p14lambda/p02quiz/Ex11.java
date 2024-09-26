package p14lambda.p02quiz;

import java.util.Arrays;
import java.util.List;

public class Ex11 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "a", "spring", "qa", "mouse", "bob");
		
		System.out.println(list);
		
		// list.sort
		list.sort((s1, s2) -> s1.length() - s2.length());
		
		
		System.out.println(list); // [a, qa, bob, java, mouse, spring]
	}
}

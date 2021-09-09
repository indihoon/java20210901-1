package p11api.p02quiz;

public class Ex02IndexOf {
	public static void main(String[] args) {
		String str = "간장 공장 공장장은 강 공장장이고 된장 공장 공장장은 공 공장장이다.";
		
		// "공장"이 있는 index들을 출력
		String s = "공장";
		int i = 0 - s.length();
		
		boolean run = true;
		while (run) {
			i = str.indexOf(s, i + s.length());
			
			if (i == -1) {
				break;
			}
			
			System.out.println(i);
		}
		
		/*
		int i1 = str.indexOf(s, 0);
		
		System.out.println(i1);
		
		int i2 = str.indexOf(s, i1 + s.length());
		
		System.out.println(i2);
		
		int i3 = str.indexOf(s, i2 + s.length());
		
		System.out.println(i3);
		*/
		
		
	}
}


















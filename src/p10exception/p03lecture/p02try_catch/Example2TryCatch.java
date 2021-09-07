package p10exception.p03lecture.p02try_catch;

public class Example2TryCatch {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		String str = "1ㅁㅁㅁㅁㅁㅁ00";
		
		try {
			// exception이 발생하면 try 블럭안의 다음 명령문 실행 안함
			int n1 = Integer.parseInt(str);
			System.out.println(n1 * 2);
		} catch (NumberFormatException e) {
			System.out.println("넘버포멧익셉션 발생");
		}
		
		System.out.println("프로그램 종료");
	}
}

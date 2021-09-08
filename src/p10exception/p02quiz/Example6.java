package p10exception.p02quiz;

public class Example6 {
	// ClassCastException
	
	public static void main(String[] args) {
		Object o = "java";
		
		String s = (String) o;
//		Number n = (Number) o;
		
		System.out.println("프로그램 종료");
		
		throw new ClassCastException();
	}
}

package p13generic.p03lecture.p02generic;

public class Ex03 {
	// generic method
	public static <T> void method1() {
		T obj1;
	}
	
	public static void main(String[] args) {
		
		Ex03.<Integer>method1();
		Ex03.method1();
		
		Ex03.<Integer>method2(3);
		Ex03.method2(3);
		
		Ex03.<Double>method2(3.14);
		Ex03.method2(3.14);
	}
	
	public static <T> void method2(T param) {
		System.out.println(param);
		System.out.println(param instanceof Integer);
		System.out.println(param instanceof Double);
	}
}

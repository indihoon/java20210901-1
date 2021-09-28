package p14lambda.p03lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Ex12Map {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		
		// forEach 
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		map.compute(1, (k, v) -> v * 10);
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		map.compute(4, (k, v) -> v);
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		map.compute(4, (k, v) ->{
			System.out.println("메소드 시작");
			
			System.out.println(k);
			System.out.println(v);
			
			System.out.println("메소드 종료");
			
			return v == null ? k * 10 : v * 10;
		});
		
		
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		map.compute(4, (k,v) -> v == null ? k * 10 : v * 10);
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		// 풀어씀
		map.compute(5, new BiFunction<Integer, Integer, Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return u == null ? t * 10 : u * 10;
			}
		});
	}
}








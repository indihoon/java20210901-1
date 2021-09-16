package p15collection.p02quiz;

import java.util.ArrayList;

public class Ex13 {
	public static void main(String[] args) {
//		Math.random();
		// 1~45사이의 값 6개 랜덤
		ArrayList<Integer> lotto = new ArrayList<>();
		
		// 코드작성
		for (int i = 0; i < 6; i++) {
			int ran = (int) (Math.random() * 45) + 1;
			lotto.add(ran);
		}
		
		
		for (int l : lotto) {
			System.out.println(l); // 6개 랜덤(중복 허용)
		}
	}
}

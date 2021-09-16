package p15collection.p02quiz;

import java.util.List;

public class Ex06 {
	public int max(List<Integer> list) {
		// list의 아이템 중 최대값 리턴
		
		int max = list.get(0);
		
		for (int item : list) {
			max = (max < item) ? item : max;
		}
		
		return max;
	}
}

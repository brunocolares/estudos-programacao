package service;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<? super T>> T max(List<T> list) {
		T max = list.get(0);
		for(T t : list) {
			if(t.compareTo(max) > 0) {
				max = t;
			}
		}
		
		return max;
	}
}

package service;

import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

public class CalculoService {

	public static <T extends Number & Comparable<? super T>> T maior(List<T> list) {
		return Collections.max(list);
	}
	
	public static <T extends Number & Comparable<? super T>> T menor(List<T> list) {
		return Collections.min(list);
	}
	
	public static <T extends Number & Comparable<? super T>> Double media(List<T> list) {
		OptionalDouble optional = list.stream()
			.mapToDouble(T::doubleValue)
			.average();
		
		return optional.getAsDouble();
		
	}
}

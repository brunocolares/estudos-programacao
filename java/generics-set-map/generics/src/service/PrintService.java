package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	List<T> list = new ArrayList<>();
	
	public void addValue(T t) {
		list.add(t);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista vazia.");
		}
		
		return list.get(0);
	}
	
	public void print() {
		for(T t : list) {
			System.out.print(t + ", ");
		}
	}
}

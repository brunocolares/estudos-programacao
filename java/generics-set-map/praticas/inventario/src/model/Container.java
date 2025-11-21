package model;

import java.util.ArrayList;
import java.util.List;

public class Container<T> {

	private List<T> itens = new ArrayList<>();
	
	public void adicionar(T t) {
		itens.add(t);
	}
	
	public void remover(T t) {
		itens.remove(t);
	}
	
	public List<T> listarTodosItens() {
		List<T> itens = new ArrayList<>();
		itens = this.itens;
		return itens;
	}

	@Override
	public String toString() {
		return "Container [itens=" + itens + "]";
	}
	
}

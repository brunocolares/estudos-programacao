package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entitie.Produto;

public class Program {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("TV", 300.0, 2));
		produtos.add(new Produto("TV", 300.0, 1));
		produtos.add(new Produto("Armário", 600.0, 1));
		produtos.add(new Produto("Ar Condicionado", 780.2, 1));
		
		System.out.println("Antes da ordenação:");
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
		Collections.sort(produtos);
		System.out.println("Após a ordenação:");
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}

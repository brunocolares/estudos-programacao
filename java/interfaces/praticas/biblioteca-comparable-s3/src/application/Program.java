package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Livro;

public class Program {

	public static void main(String[] args) {	
		List<Livro> livros = new ArrayList<>();
		
		livros.add(new Livro("O homem mais rico da babilônia", "Robert", 2009));
		livros.add(new Livro("Código Limpo", "Bruno", 2025));
		livros.add(new Livro("Bíblia", "São João", 0));
		livros.add(new Livro("Harry Potter", "Potter", 2017));
		livros.add(new Livro("Titanic", "Grayce", 1980));
		
		livros.forEach(livro -> {
			System.out.println(livro);
		});
		
		Collections.sort(livros);
		System.out.println("Depois do sort:");
		livros.forEach(livro -> {
			System.out.println(livro);
		});
		
		livros.sort(Collections.reverseOrder());
		System.out.println("Teste ordem reversa: ");
		livros.forEach(livro -> {
			System.out.println(livro);
		});
	}
}

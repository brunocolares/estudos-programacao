package application;

import java.util.List;

import model.Container;
import model.entities.Livro;
import service.CalculoService;

public class Program {

	public static void main(String[] args) {
		Container<Livro> container = new Container<>();
		container.adicionar(new Livro("Código Limpo", "Não sei", 32.00));
		container.adicionar(new Livro("O Homem Mais Rico da Babilônia", "Não sei", 24.39));
		container.adicionar(new Livro("Neymar Jr.", "Não sei", 123.99));
		
		List<Livro> livros = container.listarTodosItens();
		for(Livro livro : livros) {
			System.out.println(livro);
		}
		
		Double maiorValor = CalculoService.maior(livros.stream().map(t -> t.getValor()).toList());
		System.out.println("Maior valor encontrado: "+maiorValor);
	}

}

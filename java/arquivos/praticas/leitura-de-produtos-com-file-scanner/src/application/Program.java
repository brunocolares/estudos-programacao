package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;

public class Program {
	public static void main (String args[]) {
		File fileProdutos = new File("C:\\temp\\produtos.txt");
		Scanner sc = null;
		List<Produto> produtosList = new ArrayList<Produto>();
		
		try {
			sc = new Scanner(fileProdutos);
			String[] linhas;
			while(sc.hasNextLine()) {
				linhas = sc.nextLine().split(";");
				produtosList.add(new Produto(linhas[0], Double.parseDouble(linhas[1]), Integer.parseInt(linhas[2])));
			}
			
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: "+e.getMessage());
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		if(!produtosList.isEmpty()) {
			for(Produto produto : produtosList) {
				System.out.println(String.format("Produto: %s | Preço: %.2f | Quantidade: %d | Total : %.2f", produto.getNome(), 
						produto.getValor(), produto.getQuantidade(), produto.getValorTotal()));
			}
		}
		
	}
}

package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import leitor.LeitorDeTexto;

public class Main {
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o caminho do arquivo: ");
			String caminho = sc.nextLine();
			
			File file = new File(caminho);

			LeitorDeTexto leitor = new LeitorDeTexto();
			
			
			leitor.lerArquivo(file);
			
			System.out.println("Digite uma palavra para buscar: ");
			String palavra = sc.nextLine();
			leitor.buscarPalavra(file, palavra);
		
			sc.close();
	}
}

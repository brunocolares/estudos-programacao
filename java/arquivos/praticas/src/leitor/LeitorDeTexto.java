package leitor;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeitorDeTexto {
	
	public void lerArquivo(File file) {
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro ao tentar ler o arquivo: "+e.getMessage());
		}
		
	}
	
	public void buscarPalavra(File file, String palavra) {
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			int linhas = 0;
			String linha;
			int ocorrenciaPalavra = 0;
			while(sc.hasNextLine()) {
				linha = sc.nextLine();
				linhas++;
				if(linha.contains(palavra)) {
					System.out.println("Linha "+linhas+": "+linha);
					ocorrenciaPalavra++;
				}
				 
			}
			System.out.println("Ocorrência da palavra em :"+ocorrenciaPalavra+" linhas");

		} catch (IOException e) {
			System.out.println("Erro ao tentar ler o arquivo. "+e.getMessage());
		}
	}
}

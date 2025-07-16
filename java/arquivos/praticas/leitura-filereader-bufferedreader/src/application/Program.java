package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String args[]) {
		
		String path = "C:\\temp\\nomes.txt";
		FileReader fr = null;
		BufferedReader br = null;
		List<String> nomes;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			nomes = new ArrayList<>();
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				nomes.add(linha);
				linha = br.readLine();
			}
			
			System.out.printf("Existe(m) %d nome(s). Em ordem alfabética:%n", nomes.size());
			nomes.sort(null);
			for(String nome : nomes) {
				System.out.println(nome);
			}
			System.out.println("O primeiro nome é: "+nomes.get(0));
			System.out.println("O último nome é: "+nomes.get(nomes.size()-1));
			
		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
				
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}

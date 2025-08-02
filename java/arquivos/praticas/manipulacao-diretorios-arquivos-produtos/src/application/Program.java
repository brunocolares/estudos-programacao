package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Item;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho do arquivo csv com os itens: ");
		String path = sc.nextLine();
		
		File fileCsv = new File(path);
		try (BufferedReader bf = new BufferedReader(new FileReader(fileCsv))) {
			List<Item> itens = new ArrayList<>();
			String linha;
			while((linha = bf.readLine()) != null) {
				itens.add(new Item(linha.split(";")[0], 
						Double.parseDouble(linha.split(";")[1]), Integer.parseInt(linha.split(";")[2])));
			}
			
			if(!itens.isEmpty()) {
				File fileSummaryDirectory = new File(fileCsv.getParent()+"\\out");
				boolean pastaCriada = fileSummaryDirectory.mkdir();
				if(pastaCriada) {
					File fileSummary = new File(fileSummaryDirectory+"\\summary.csv");
					try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileSummary))) {
						for(Item item : itens) {
							bw.write(item.gerarLinhaSummary());
							bw.newLine();
						}
						System.out.println("Valores totais gerados em: "+fileSummary.getPath());
					} 
					
				}
			}
			
		} catch (IOException e) {
			System.out.println("Erro ao ler e/ou escrever arquivo."+e.getMessage());
		}
		
		
		sc.close();
		
	}
}

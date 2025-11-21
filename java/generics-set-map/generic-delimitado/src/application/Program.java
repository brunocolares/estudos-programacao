package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import service.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		String path = "C:\\temp\\in.txt";
		List<Product> produtos = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line != null) {
				String[] lidos = line.split(",");
				produtos.add(new Product(lidos[0], Double.parseDouble(lidos[1])));
				line = br.readLine();
			}
			
			Product max = CalculationService.max(produtos);
			System.out.println("Produto de maior valor: "+max);
		} catch (IOException e) {
			System.out.println("Erro.");
		}

	}

}

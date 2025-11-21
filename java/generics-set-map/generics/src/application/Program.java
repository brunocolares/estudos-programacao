package application;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma quantidade: ");
		int qnt = sc.nextInt();
		sc.nextLine();
		PrintService<String> service = new PrintService<String>();
		System.out.println("Digite os valores:");
		for(int i = 0; i < qnt; i++) {
			String valor = sc.nextLine();
			service.addValue(valor);
		}
		System.out.println("Primeiro elemento: "+ service.first());
		service.print();
		
		sc.close();

	}

}

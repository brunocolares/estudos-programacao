package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um diretório: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Pastas:");
		for(File file : folders) {
			System.out.println(file);
		}
		
		System.out.println("Arquivos:");
		File[] arquivos = path.listFiles(File::isFile);
		for(File file : arquivos) {
			System.out.println(file);
		}
		
		boolean isPastaCriada = new File(strPath + "\\subpasta").mkdir();
		if(isPastaCriada) {
			System.out.println("Pasta criada.");
			
		}
		
		sc.close();
	}
}

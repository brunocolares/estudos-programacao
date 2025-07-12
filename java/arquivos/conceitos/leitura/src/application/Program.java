package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				// O next() também poderia ser usado, mas
				// esse método utiliza espaços como delimitador padrão, quebrando o texto.
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: "+e.getMessage());
			
		} finally {
			if(sc != null) {
				sc.close();
			}
				
		}
		
	}
	
}

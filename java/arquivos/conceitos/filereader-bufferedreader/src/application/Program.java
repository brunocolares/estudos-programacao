package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		String path = "C:\\temp\\in.txt";
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
				if(br != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}

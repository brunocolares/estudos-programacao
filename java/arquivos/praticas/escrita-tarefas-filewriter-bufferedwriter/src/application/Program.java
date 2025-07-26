package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		String path = "C:\\temp\\tarefas.txt";
		try (Scanner sc = new Scanner(System.in)){
			
			String tarefa = "";
			List<String> tarefas = new ArrayList<>();
			while(!tarefa.equalsIgnoreCase("sair")) {
				System.out.print("Digite uma tarefa ou 'sair' para sair: ");
				tarefa = sc.nextLine();
				if(!tarefa.equalsIgnoreCase("sair")) {
					tarefas.add(tarefa);
				}
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
				for(String tf : tarefas) {
					bw.write(tf);
					bw.newLine();
				}
				System.out.println("Tarefas salvas com sucesso!");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}

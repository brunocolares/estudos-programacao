package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import entities.Acesso;

public class Program {
	public static void main(String[] args) {

		List<Acesso> acessosList = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\acessos.txt"))){
			String linha;
			while((linha = br.readLine()) != null) {
				String[] linhaSplit = linha.split(";");
				
				acessosList.add(new Acesso(linhaSplit[0], LocalDate.parse(linhaSplit[1], DateTimeFormatter.ISO_DATE),
						LocalTime.parse(linhaSplit[2], DateTimeFormatter.ISO_LOCAL_TIME),
						linhaSplit[3]));
			}
		} catch (IOException e) {
			System.out.println("Erro ao tentar ler o log de acessos."+e.getMessage());
		}
		
		Map<String, Integer> acessosPorUsuario = new HashMap<>();
		Map<String, Integer> acessosPorIp = new HashMap<>();
		for(Acesso acesso : acessosList) {
			String usuario = acesso.getUsuario();
			String ip = acesso.getIp();
			
			if(acessosPorUsuario.containsKey(usuario)) {
				acessosPorUsuario.put(usuario, acessosPorUsuario.get(usuario) + 1);
			} else {
				acessosPorUsuario.put(usuario, 1);
			}
			
			if(acessosPorIp.containsKey(ip)) {
				acessosPorIp.put(ip, acessosPorIp.get(ip) + 1);
			} else {
				acessosPorIp.put(ip, 1);
			}
		}
		System.out.println("Acessos por usuário:");
		acessosPorUsuario.forEach((key, value) -> {
			System.out.printf("%s -> %d %n", key, value);
		});
		System.out.println("Acessos por ip:");
		acessosPorIp.forEach((key, value) -> {
			System.out.printf("%s -> %d %n", key, value);
		});
		Scanner sc = null;
		sc = new Scanner(System.in);
		System.out.print("Insira uma data para buscar os acessos: ");
		LocalDate data = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ISO_DATE);
		for(Acesso acesso : acessosList) {
			if(data.isEqual(acesso.getData())) {
				System.out.printf("%s às %s %n", acesso.getUsuario(), acesso.getHorario());
			}
		}
		sc.close();	
	}
}

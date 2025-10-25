package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Bruno", 21);
		Pessoa p2 = new Pessoa("Emillin", 24);
		Pessoa p4 = new Pessoa("Israel", 52);
		Pessoa p3 = new Pessoa("Cláudia", 50);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p4);
		pessoas.add(p3);
		
		
		System.out.println("Lista antes:");
		for(Pessoa pessoa : pessoas ) {
			System.out.println(pessoa);
		}
		
		Collections.sort(pessoas);
		System.out.println("Lista depois: ");
		for(Pessoa pessoa : pessoas ) {
			System.out.println(pessoa);
		}

	}

}

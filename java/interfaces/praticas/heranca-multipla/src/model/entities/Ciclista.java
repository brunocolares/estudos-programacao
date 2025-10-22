package model.entities;

public class Ciclista extends AbstractAtleta implements ICiclista {

	public Ciclista(String nome, String endereco) {
		super(nome, endereco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pedalar() {
		System.out.println("Pedalando...");
		
	}

	@Override
	public void aquecer() {
		System.out.println("Ciclista aquecendo...");
		
	}

	
}

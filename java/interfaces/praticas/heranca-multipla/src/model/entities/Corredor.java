package model.entities;

public class Corredor extends AbstractAtleta implements ICorredor {
	
	public Corredor(String nome, String endereco) {
		super(nome, endereco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void correr() {
		System.out.println("Correndo...");
		
	}

	@Override
	public void aquecer() {
		System.out.println("Corredor aquecendo...");
		
	}
	
}

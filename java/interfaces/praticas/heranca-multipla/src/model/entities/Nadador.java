package model.entities;

public class Nadador extends AbstractAtleta implements INadador{
	

	public Nadador(String nome, String endereco) {
		super(nome, endereco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nadar() {
		System.out.println("Nadando...");
		
	}

	@Override
	public void aquecer() {
		System.out.println("Nadador aquecendo...");
		
	}
}

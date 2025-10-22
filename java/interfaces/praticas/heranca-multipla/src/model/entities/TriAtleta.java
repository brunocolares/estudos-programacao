package model.entities;

public class TriAtleta extends AbstractAtleta implements INadador, ICorredor, ICiclista {
	
	
	
	public TriAtleta(String nome, String endereco) {
		super(nome, endereco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aquecer() {
		System.out.println("Triatleta aquecendo...");
		
	}
	
	@Override
	public void pedalar() {
		System.out.println("Triatleta pedalando...");
		
	}

	@Override
	public void correr() {
		System.out.println("Triatleta correndo....");
		
	}

	@Override
	public void nadar() {
		System.out.println("Triatleta nadando...");
		
	}
}

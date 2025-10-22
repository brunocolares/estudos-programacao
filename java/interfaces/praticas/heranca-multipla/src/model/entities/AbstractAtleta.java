package model.entities;

public abstract class AbstractAtleta extends Pessoa {
	
	
	public AbstractAtleta(String nome, String endereco) {
		super(nome, endereco);
		// TODO Auto-generated constructor stub
	}

	public abstract void aquecer();
}
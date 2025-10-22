package application;

import model.entities.Ciclista;
import model.entities.Corredor;
import model.entities.Nadador;
import model.entities.TriAtleta;

public class Program {
	public static void main(String[] args) {
		Corredor corredor = new Corredor("Bruno", "Rio de Janeiro");
		Nadador nadador = new Nadador("Cláudia", "Brasília");
		Ciclista ciclista = new Ciclista("Israel", "Amazonas");
		TriAtleta triatleta = new TriAtleta("Gabriel Medina", "Amapá");
		
		corredor.aquecer();
		nadador.aquecer();
		ciclista.aquecer();
		triatleta.aquecer();
		
		corredor.correr();
		nadador.nadar();
		ciclista.pedalar();
		
		triatleta.correr();
		triatleta.nadar();
		triatleta.pedalar();
		
		System.out.println("Corredor: "+corredor);
		System.out.println("Nadador: "+nadador);
		System.out.println("Ciclista: "+ciclista);
		System.out.println("Triatleta: "+triatleta);
	}
}
